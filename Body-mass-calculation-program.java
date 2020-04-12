
package com.company;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    double m1 ,  r;
    double m2;
    Scanner in= new Scanner(System.in);
    System.out.print("Enter your weight kg : ");
     m1 = in.nextDouble();
     System.out.print(" Enter the length \" (example) if your height is 180, enter as 1.80 \" : ");
     m2 = in.nextDouble();
     r = sum(m1 ,m2);
    System.out.println( " Your body mass is : "+ r);
    // Question stage to show the result
 if(r >= 30){
          System.out.println("Too much weight you should follow a diet");
      }else if( r <= 27 && r >= 24){
              System.out.println("Your weight is very good ");
          }else {
     System.out.println("Very little weight. Follow a diet to gain weight ");
 }
      }
 public static double sum(double x , double z){
    double o = z * z;
    return x / o;
 }
}

