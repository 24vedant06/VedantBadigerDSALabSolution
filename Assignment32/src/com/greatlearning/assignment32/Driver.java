package com.greatlearning.assignment32;

public class Driver {

	
		public static Node node;
		static Node lastNode = null;
		static Node head = null;

		static void BinarytoSkewed(Node root) {

			if (root == null) {
				return;
			}

			BinarytoSkewed(root.left);
			Node right = root.right;
			Node left = root.left;

			if (head == null) {
				head = root;
				root.left = null;
				lastNode = root;
			} else {
				lastNode.right = root;
				root.left = null;
				lastNode = root;
			}

			BinarytoSkewed(right);

		}

		static void RightTree(Node root) {
			if (root == null) {
				return;
			}
			System.out.print(root.num + " ");
			RightTree(root.right);
		}

		public static void main(String[] args) {

			Driver tree = new Driver();
			tree.node = new Node(50);
			tree.node.left = new Node(30);
			tree.node.right = new Node(60);
			tree.node.left.left = new Node(10);
			tree.node.right.left = new Node(55);

			BinarytoSkewed(node);
			System.out.println("The Tree is  :");
			RightTree(head);
		}
	

}
