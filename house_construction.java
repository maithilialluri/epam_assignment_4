package assignment4;

import java.util.Scanner;

public class house_construction {
           public static void main(String args[]){
        	   Scanner sc=new Scanner(System.in);
        	   System.out.println("The required area of the house : ");
        	   double ft=sc.nextInt();
        	   System.out.println("Enter 1 to have a house with Standard Materials");
        	   System.out.println("Enter 2 to have a house with Above Standard Materials");
        	   System.out.println("Enter 3 to have a house with High Standard Materials");
        	   System.out.println("Enter 4 to have a house with High Standard Materials and with Automated features");
        	   int ch=sc.nextInt();
        	   materials_required ob=new materials_required();
        	   double res;
        	   switch(ch){
        	   case 1:res=ob.std_materials(ft);
        	          break;
        	   case 2:res=ob.Abv_std_materials(ft);
        	          break;
        	   case 3:res=ob.High_std_materials(ft);
        	          break;
        	   case 4:res=ob.High_Auto_std_materials(ft);
        	          break;
        	   default:System.out.print("!!!please Enter valid option");
        	           return;
        	   }
        	   System.out.println("The Total cost of Construction of house : " + res);
           }
}
