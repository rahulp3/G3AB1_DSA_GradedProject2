package com.gl.controller;

import java.util.*;

public class Driver {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		ArrayList<Integer> list = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building");
		int num_of_floors = s.nextInt();
		int floor_size;
		for (int i = 0; i < num_of_floors; i++) {
			System.out.println("Enter the floor size given on day :" + (i + 1));
			list.add(s.nextInt());
		}
		System.out.println("The order of construction is as follows:");
		for (int i = 0; i < list.size() - 1; i++) {
			System.out.println("Day :" + (i + 1));
			if (list.get(i) < list.get(i + 1)) {
				stack.push(list.get(i));
			} else {
				stack.push(list.get(i));
				while (!stack.isEmpty() && stack.peek() > list.get(i + 1)) {
					System.out.print(stack.pop() + " ");
				}
			}
			System.out.println();
		}
		System.out.println("Day :" + (list.size()));
		stack.push(list.get(list.size() - 1));
		while (!stack.isEmpty())
			System.out.print(stack.pop() + " ");
	}
}
