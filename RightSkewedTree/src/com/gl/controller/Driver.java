package com.gl.controller;

import com.gl.service.BSTOps;
import com.gl.service.Node;

public class Driver {

	public static void main(String[] args) {

		BSTOps tree = new BSTOps();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		tree.BSTtoRightSkewedTree(tree.node);
		tree.printRightSkewedTree(tree.headNode);

	}

}
