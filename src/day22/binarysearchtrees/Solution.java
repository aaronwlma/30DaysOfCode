package day22.binarysearchtrees;

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

public class Solution{
	public static int getHeight(Node root){
      //Write your code here
        // If the root node has nothing, return a 0
        if (root == null) {
            return 0;
        }
        
        // Otherwise, recursively check the height of both sides of the trie
        else {
            int leftHeight = getHeight(root.left);
            int rightHeight = getHeight(root.right);
            
            // If it's the last node of the branch, no need to increment
            if (root.left == null && root.right == null) {
                if (leftHeight > rightHeight) {
                    return leftHeight;
                }
                else {
                    return rightHeight;
                }
            }

            // After recursion ends, use the bigger of the two heights
            if (leftHeight > rightHeight) {
                return leftHeight + 1;
            }
            else {
                return rightHeight + 1;
            }
        }        
    }
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
        int height=getHeight(root);
        System.out.println(height);
    }
}
    