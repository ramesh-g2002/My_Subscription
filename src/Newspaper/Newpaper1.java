package Newspaper;

import java.util.Scanner;

public class Newpaper1 {
	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        double num=sc.nextDouble();
     double[] val={26, 20.5, 34, 10.5, 18};
     String[] name={"TOI", "Hindu", "ET", "BM", "HT"};
     for(int i=0; i<val.length-1; i++){
             for(int j=i+1; j<val.length; j++){
                 
                 if(val[i]+val[j]<=num && val[i]!=val[j]){
                     
                     System.out.print("{\""+name[i]+"\","+"\""+name[j]+"\"}");
                 }
        
             }
         }
    }

}
