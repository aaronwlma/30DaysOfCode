package day23.bstlevelordertraversal;

import java.util.*;
import java.io.*;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

class Solution{
	static void levelOrder(Node root){
	    //Write your code here
	  
	  if (root != null) {
	      Queue<Node> q = new LinkedList<Node>();
	      q.add(root);
	      
	      while(!q.isEmpty()) {
	          Node curr = q.remove();
	          System.out.print(curr.data + " ");
	          
	          if (curr.left != null) {
	              q.add(curr.left);
	          }
	          if (curr.right != null) {
	              q.add(curr.right);
	          }
	      }
	  }
}

//levelOrder(BinaryTree t) {
//   if(t is not empty) {
//       // enqueue current root
//       queue.enqueue(t)
      
//       // while there are nodes to process
//       while( queue is not empty ) {
//           // dequeue next node
//           BinaryTree tree = queue.dequeue();
          
//           process tree's root;
          
//           // enqueue child elements from next level in order
//           if( tree has non-empty left subtree ) {
//               queue.enqueue( left subtree of t )
//           }
//           if( tree has non-empty right subtree ) {
//               queue.enqueue( right subtree of t )
//           }
//       }
//   } 
//} 

public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}