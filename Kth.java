//find k'TH max and min element of an array


import java.util.*;
import java.io.*;

class Kth
{
  public static void main(String[] args){
     // int arry[]={1,20,30,40,10,103};
     int len;
     int n,kmx,mn;
     
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of arry ");
         n=sc.nextInt();
     int arry[]= new int[n]; 
         System.out.println("Please enter the values::");
        
      for(int i=0;i<n;i++)
         {
             int a=sc.nextInt();
             arry[i]=a;
         }
           len=arry.length;
           Arrays.sort(arry);
      
      System.out.println("enter K'th max element");
      kmx= sc.nextInt();
      System.out.println("The "+kmx+"'th value is: "+arry[len-kmx]);      
       
      System.out.println("enter K'th min element");
      mn=sc.nextInt();
      System.out.println("The "+mn+"'th value is: "+arry[mn-1]);         
  }
}

