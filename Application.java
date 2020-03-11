package assignment4;

import java.util.Scanner;

public class Application {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double p,t,r;
	    System.out.println("Enter the amount: ");
	    p=sc.nextInt();
	    System.out.println("Enter time taken: ");
	    t=sc.nextInt();
	    System.out.println("Enter the Rate of Interest: ");
	    r=sc.nextInt();
	    Interest obj=new Interest();
	    double SI = obj.Simple_Interest(p,t,r);
	    double CI=obj.Compound_Interest(p,t,r);
	    System.out.println("Simple Interest: " + SI);
	    System.out.println("Compound Interest: " + CI);
	}

}
