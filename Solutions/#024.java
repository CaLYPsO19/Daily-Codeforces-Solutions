/*
George and Accommodation
George has recently entered the BSUCP (Berland State University for Cool Programmers). George has a friend Alex who has also entered the university. Now they are moving into a dormitory.

George and Alex want to live in the same room. The dormitory has n rooms in total. At the moment the i-th room has pi people living in it and the room can accommodate qi people in total (pi ≤ qi). Your task is to count how many rooms has free place for both George and Alex.
*/
 import java.util.*;
 import java.lang.*;
 import java.io.*;
 public class george
 {
     public static void main (String[] args) throws java.lang.Exception
     {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int result=0;
         for(int i=0;i<n;i++){
             int j=sc.nextInt();
             int k=sc.nextInt();
             if((k-j)>=2)
                 result++;
         }
         System.out.println(result);
     }
 }
