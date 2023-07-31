package com.multi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ScorePick {
	public static void main(String[] args) {
		File file = new File("score");
		FileReader fr = null;
		BufferedReader br = null;
		List<User> list = new ArrayList<>();	

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String line = null;
			while((line = br.readLine()) != null){
//				System.out.println(line);
				String[] array = line.split(",");
				String name = array[0].strip();
				int score = Integer.parseInt(array[1].strip());
				User user = new User(name, score);
				list.add(user);
			}
			
			Collections.sort(list);
			int count = 0;
			for(User u : list) {
				System.out.println(u);
				if(u.getScore() == 0) {
					count++;
				}
			}
			System.out.println("총 인원 : "+ list.size());
			System.out.println("제출 안하신분 : "+ count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

// User [name=윤일권, score=539]
// User [name=박예솔, score=476]
// User [name=지석환, score=473]

class User implements Comparable<User> {
	private String name;
	private int score;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", score=" + score + "]";
	}

	public User(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public User() {
		super();
	}

	@Override
	public int compareTo(User o) {
		return Integer.compare(o.getScore(), this.getScore());
	}
}