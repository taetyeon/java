<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <script src="https://code.jquery.com/jquery-latest.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>AJAX 실습</title>
    <style>
        div {
            height: 200px;
            width: 100%;
            border: 1px solid black;
            margin-top: 3px;
        }
    </style>
</head>

<body>
    <h2>AJAX 실습</h2>
    <hr>
    <h3>JavaScript를 활용한 AJAX 실습</h3>
    <h3>1. GET 방식을 통한 서버 송수신 방법</h3>
    <button onclick="ajaxTest1()">get 방식 전송</button>
    <div id="div1">
    </div>
    <script>
        function ajaxTest1() {

            // 1. xhr 객체 생성
            let xhr = new XMLHttpRequest();

            // 2. onreadystatechange 이벤트 리스너 생성(콜백 함수)
            //    -> 메세지가 전송되고, 응답 결과에 따라 로직을 미리 구성하는 함수
            xhr.onreadystatechange = function () {
                console.log('readyState : ' + xhr.readyState);
                console.log('status : ' + xhr.status);

                // document.getElementById('div1').innerHTML += 'readyState : ' + xhr.readyState + '<br>';
                // document.getElementById('div1').innerHTML += 'status : ' + xhr.status + '<br>';

                if (xhr.readyState == 4) { // 4 : 요청은 성공한 상태
                    if (xhr.status == 200) { //  200 : HTTP 응답코드로 응답이 성공한 경우
                        let str = xhr.responseText;
                        document.getElementById('div1').innerHTML += str + '<br>'
                    } else {
                        // 응답 결과가 좋지 않을때, 
                        // 404 : not found, 500 : 서버에러, 403 : forbidden= get/post
                        document.getElementById('div1').innerHTML += '에러 발생!' + '<br>'
                    }
                } else {
                    // 요청 전달 실패, client의 네트워크 에러, URL 잘못됬을때
                    // document.getElementById('div1').innerHTML += '인터넷 오류 발생!' + '<br>'
                }
            }

            // 3. xhr open 시 필요한 정보 셋팅
            //       let url = '/05_AJAX/jsAjax.do';
            let url = '${path}/jsAjax.do';
            let getParameter = '?name=홍길동&age=31';
            url += getParameter;

            // 4. xhr open 시도, 연결이 실패하면 에러가 발생한다.
            // open(방식, url, 비동기식 전송여부 = 사실 상관 없다.)
            xhr.open('get', url, true);

            // 5. xhr 전송
            xhr.send(); // 실제 get 요청이 날라가는 시점

        }
    </script>
    <hr><br>

    <h3>2. POST 방식을 통한 서버 송수신 방법</h3>
    <button onclick="ajaxTest2();">Post 방식 전송</button>
    <div id="div2"></div>
    <script>
        function ajaxTest2(){
            let xhr = new XMLHttpRequest();
            xhr.onreadystatechange = function(){
                document.getElementById('div2').innerHTML = 'status : ' + xhr.status + '<br>';
                if(xhr.readyState == 4 && xhr.status == 200){ // 정상 일때
                    let str = xhr.responseText;
                    document.getElementById('div2').innerHTML += str + '<br>';
                } 
            }
            let url = '<%=request.getContextPath()%>/jsAjax.do';
            let parameter = 'name=최길동&age=21'; // get하고 다른점, 반드시 '?' 제거할것!!! 

            xhr.open('post', url, true); // post로 변경할것!!
            // post 헤더설정, POST 방식으로 파라메터가 있음을 알리는 MIME 셋팅
            xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
            xhr.send(parameter);
        }        
    </script>
    <hr><br>

    <h2>Jquery 방식의 AJAX 실습</h2>

    <h3>1. get 방식 서버 요청</h3>
    <button id="ajaxSend1"> GET방식 전송</button>
    <p> 메세지 : <input type="text" id="input1" /></p>
    <div id="div3"></div>
    <script>
        $('#ajaxSend1').click(
            ()=>{
                let inputValue = $('#input1').val();

                // ajax 전송 코드부
                $.ajax({
                    // json 영역, key-value 형태로 값이 들어가면 된다.
                    // 1. 전송 type : get(default), post
                    type:'get',
                    // 2. URL
                    url:'${path}/jqAjax1.do',
                    // 3. 파라메터=data, 서버로 전송될
                    data:{
                        inputValue : inputValue
                    },
                    // 4. success 리스너 등록 : 성공했을때 이벤트를 처리할 함수
                    success : (result) =>{
                        $('#div3').html(result);
                    },
                    // 5. error 리스너 등록 : 에러 발생했을때 처리할 리스너 함수
                    error : (e) =>{
                        $('#div3').html('에러 발생!');
                        console.log(e);
                    }
                });
            }
        );
    </script>
    <hr><br>

    <h3>2. POST 방식을 통한 서버 송수신 방법</h3>
    <button id="ajaxSend2"> POST 방식 전송</button>
    <p> 이름 : <input type="text" id="input2_name" /></p>
    <p> 나이 : <input type="text" id="input2_age" /></p>
    <div id="div4"></div>
    <script>
        $('#ajaxSend2').click(
            () => {
                let name = $('#input2_name').val();
                let age =  $('#input2_age').val();

                $.ajax({
                    type:'post',
                    url:'${path}/jqAjax2.do',
                    data : {
                        // name : name,
                        // age : age,
                        name, // key-value가 같으면 한번만 쓰면 된다. (이름 또는 데이터가 생략)
                        age,
                    },
                    success: (result) => {
                        $('#div4').html(result);
                    }, 
                    error: (e) => {
                        $('#div4').html('에러 발생!!');
                    }, 
                });
            }
        );
    </script>
    <hr><br>
    
    <h3>3. JSON 객체 수신하는 방법</h3>
    <button id="ajaxSend3"> 객체 응답받기</button>
    <div id="div5"></div>
    <script>
        $('#ajaxSend3').click(
            ()=>{
                $.ajax({
                    type:'get',
                    url:'${path}/jqAjax3.do',
                    dataType:'json', // java에서 json으로 전달할때 type 지정이 필요
                    success : (obj) =>{
                        str = '회원번호 : ' + obj.no + '<br>';
                        str += '이름 : ' + obj.name + '<br>';
                        str += '나이 : ' + obj.age + '<br>';
                        str += '성별 : ' + obj.gender + '<br>';
                        $('#div5').html(str);
                    },
                    error: (e) => {
                        $('#div5').html('에러 발생!!');
                    }, 
                });
            }
        );

    </script>
    <hr><br>

    <h3>4. JSON 객체 '리스트' 수신하는 방법</h3>
    <button id="ajaxSend4"> 객체 응답받기</button>
    <p id="div6"></p>
    <script>
        $('#ajaxSend4').click(
            ()=>{
                $.ajax({
                    type:'get',
                    url:'${path}/jqAjax4.do',
                    dataType:'json', // java에서 json으로 전달할때 type 지정이 필요
                    success : (list) =>{
                        str = '';
                        $.each(list, (i, obj)=>{
                            str += (i + 1) +'번째 회원정보<br>';
                            str += '회원번호 : ' + obj.no + '<br>';
                            str += '이름 : ' + obj.name + '<br>';
                            str += '나이 : ' + obj.age + '<br>';
                            str += '성별 : ' + obj.gender + '<br><hr>';
                        });
                        $('#div6').html(str);
                    },
                    error: (e) => {
                        $('#div6').html('에러 발생!!');
                    }, 
                });
            }
        );
    </script>
    <hr><br>

    <h3>5. JSON 객체 '리스트' 수신하는 방법 - 테이블로 만들어보기 </h3>
    <button id="ajaxSend5"> 객체 응답받기</button>
    <p id="div7"></p>
    <script>
        $('#ajaxSend5').click(()=>{
            $.ajax({
                type:'get',
                    url:'${path}/jqAjax4.do',
                    dataType:'json', 
                    success : (list) =>{
                        str = '';
                        str += '<table boarder="1">';
                        str += '<tr>';
                        str += '   <th>No</th>';
                        str += '   <th>회원번호</th>';
                        str += '   <th>이름</th>';
                        str += '   <th>나이</th>';
                        str += '   <th>성별</th>';
                        str += '</tr>';
                        $.each(list, (i, obj)=>{
                            str += '<tr>';
                            str += '<td>' + (i + 1) +'</td>';
                            str += '<td>' + obj.no + '</td>';
                            str += '<td>' + obj.name + '</td>';
                            str += '<td>' + obj.age + '</td>';
                            str += '<td>' + obj.gender + '</td>';
                            str += '</tr>';
                        });
                        str += '</table>';
                        $('#div7').html(str);
                    },
                    error: (e) => {
                        $('#div7').html('에러 발생!!');
                    }, 
            });           
        });
    </script>
    <hr><br>

    <h3>6. 'GSON' 객체 '리스트' 수신하는 방법 - 테이블로 만들어보기</h3>
    <p> Page : <input type="text" id="page" /></p>
    <button id="ajaxSend6"> page로 요청하기</button>
    <p id="div8"></p>

    <script>
        $('#ajaxSend6').click(()=>{
            let page = $('#page').val();
            $.ajax({
                type:'get',
                url:'${path}/jqAjax5.do',
                dataType:'json', 
                data:{
                    page,
                },
                success:(list)=>{
                    str = '';
                    str += '<table boarder="1">';
                    str += '<tr>';
                    str += '   <th>No</th>';
                    str += '   <th>회원번호</th>';
                    str += '   <th>이름</th>';
                    str += '   <th>나이</th>';
                    str += '   <th>성별</th>';
                    str += '</tr>';
                    $.each(list, (i, obj)=>{
                        str += '<tr>';
                        str += '<td>' + (i + 1) +'</td>';
                        str += '<td>' + obj.no + '</td>';
                        str += '<td>' + obj.name + '</td>';
                        str += '<td>' + obj.age + '</td>';
                        str += '<td>' + obj.gender + '</td>';
                        str += '</tr>';
                    });
                    str += '</table>';
                    $('#div8').html(str);
                },
                error:(e)=>{
                    $('#div8').html('에러 발생!!');
                }
            });
        });
    </script>


</body>

</html>