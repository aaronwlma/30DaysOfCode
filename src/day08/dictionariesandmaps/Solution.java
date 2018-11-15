package day08.dictionariesandmaps;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

public class Solution {
  public static void main(String []argh){
      Scanner in = new Scanner(System.in);
      Map<String, Integer> phoneBook = new HashMap<String, Integer>();
      int n = in.nextInt();
      for(int i = 0; i < n; i++){
          String name = in.next();
          int phone = in.nextInt();
          // Write code here
          phoneBook.put(name, phone);
      }
      //System.out.println(phoneBook.toString());

      while(in.hasNext()){
          String s = in.next();
          // Write code here
          if (phoneBook.get(s) == null) {
              System.out.println("Not found");
          }
          else {
              System.out.println(s + "=" + phoneBook.get(s));
          } 
      }
      in.close();
  }
}