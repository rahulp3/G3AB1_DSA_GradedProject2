package com.gl.service;

public class Node {
	public Node left;
	public Node right;
	public int data;

	public Node(int value) {
		this.data = value;
		left = right = null;
	}
}
