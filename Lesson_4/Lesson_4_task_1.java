package com.site;

//Text of task: Enter three numbers. Find out how many of them are odd.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson_4_task_1 {

	public static void main(String[] args) throws IOException {

		int count = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 1; i < 4; i++) {
			System.out.println("Enter the number " + i + ":");
			int num = Integer.parseInt(br.readLine());
			if (num % 2 == 0) {
				count++;
			}
		}

		System.out.println("Amount of odd numbers: " + count);

	}

}
