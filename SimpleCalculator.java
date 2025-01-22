package day333;
import java.util.Scanner;
public class SimpleCalculator {
	public static int SumNum(int a,int b) {
		return a+b;
	}
	public static int SubtractNum(int a,int b) {
		return a-b;
	}
	public static int MultiplyNum(int a,int b) {
		return a*b;
	}
    public static int DivideNum(int a,int b) {
    	return a/b;
    }
    public static int LargestNum(int a,int b) {
    	if(a>b) {
    		return a;
    	}
    	else {
    		return b;
    	}
    }
    public static int SmallestNum(int a,int b) {
    	if(a<b) {
    		return a;
    	}
    	else {
    		return b;
    	}
    }
    public static int avg(int a,int b) {
    	int sum =a+b;
    	int avgg = sum/2;
    	return avgg;
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Type the Operation to do : Add , Sub , Mul , Div , smalNum , LargeNum , Avg : ");
    	String str = sc.nextLine();    	
    	int a = sc.nextInt();
    	int b= sc.nextInt();
    	
    	if (str.equals("Add")) {
            System.out.println("Result: " + SumNum(a, b));
        } else if (str.equals("Sub")) {
            System.out.println("Result: " + SubtractNum(a, b));
        } else if (str.equals("Mul")) {
            System.out.println("Result: " + MultiplyNum(a, b));
        } else if (str.equals("Div")) {
            System.out.println("Result: " + DivideNum(a, b));
        } else if (str.equals("smalNum")) {
            System.out.println("Smallest number: " + SmallestNum(a, b));
        } else if (str.equals("LargeNum")) {
            System.out.println("Largest number: " + LargestNum(a, b));
        } else if (str.equals("Avg")) {
            System.out.println("Average: " + avg(a, b));
        } else {
            System.out.println("Invalid operation.");
        }
    	sc.close();
    	
    }

}
