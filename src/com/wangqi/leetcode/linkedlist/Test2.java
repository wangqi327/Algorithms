package com.wangqi.leetcode.linkedlist;
public class Test2 {
		
	public static void printNode(Node node){
		Node temp = node;
		while(null != temp){
			System.out.print(" "+temp.getData());
			temp = temp.getNext();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("START");
		Node node1 = new Node(1);
		Node node2 = new Node(2,node1);
		Node node3 = new Node(3,node2);
		Node node = new Node(4,node3);
		printNode(node);
		System.out.println("-----");

	}

}

