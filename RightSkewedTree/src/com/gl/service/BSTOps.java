package com.gl.service;

public class BSTOps {
	public Node node;
	public Node prevNode = null;
	public Node headNode = null;

	public void BSTtoRightSkewedTree(Node root) {

		if (root == null) {
			return;
		}

		BSTtoRightSkewedTree(root.left);
		Node rightNode = root.right;

		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		BSTtoRightSkewedTree(rightNode);

	}

	public void printRightSkewedTree(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		printRightSkewedTree(root.right);
	}
}
