package day333;

import java.util.Scanner;
import java.util.ArrayList;
public class StrangeCalc2{  
    
    public static void main(String[] args) {
	    ArrayList<Integer> numbers = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		for (int i=0;i<num;i++){
		    int n = sc.nextInt();
		    numbers.add(n);
		   
		}
		int sum = 0;
		for (int n: numbers){
		    sum += n;
		}
	    System.out.println("sum : " + sum);
		
		int sub = numbers.get(1) - numbers.get(0);
		System.out.println("Sub : " + sub);
 		int mul = 1;
 		for (int n: numbers){
 		    mul *= n;
 		}
 		System.out.println("mul : " + mul);
 		int div = numbers.get(1)/numbers.get(0);
 		System.out.println("div : " + div);
 		int rem = numbers.get(1)%numbers.get(0);
 		System.out.println("rem : " + rem);
 		int avg = sum/num;
 		System.out.println("avg : " + avg);
		
	
		
	}
    
	
}