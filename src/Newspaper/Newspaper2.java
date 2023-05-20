package Newspaper;

import java.util.Scanner;

public class Newspaper2 {
	public static double sumOfArray(double[] arr) {
		  double sum=0;
		  for (int i = 0; i < arr.length; i++) {
		   sum+=arr[i];
		  }
		  return sum;
		 }
		 public static void driver(double num) {
		  String[] newsPaper= {"TOI","Hindu","ET","BM","HT"};
		  double[] TOI= {3,3,3,3,3,5,6};
		  double[] Hindu= {2.5,2.5,2.5,2.5,2.5,4,4};
		  double[] ET= {4,4,4,4,4,4,10};
		  double[] BM= {1.5,1.5,1.5,1.5,1.5,1.5,1.5,};
		  double[] HT= {2,2,2,2,2,4,4};
		  double[] sumOfarr= {sumOfArray(TOI),sumOfArray(Hindu),sumOfArray(ET),sumOfArray(BM),sumOfArray(HT)};
		  for (int i = 0; i < sumOfarr.length-1; i++) {
		   for (int j = i+1; j < sumOfarr.length; j++) {
		    double comp=sumOfarr[i]+sumOfarr[j];
		    if (num>=comp) {
		    // System.out.println(comp);
		     System.out.print("{\""+newsPaper[i]+"\" , "+"\""+newsPaper[j]+"\"}");
		    }
		   }
		  }
		  
		 }
		 public static void main(String[] args) {
		   
		  Scanner sc1= new Scanner(System.in);
		  System.out.println("Enter the Number:");
		  double num=sc1.nextDouble();
		  driver(num);
		  sc1.close();
		  
		 }

}
