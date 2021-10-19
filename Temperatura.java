package br.com.fundamentos;

import java.util.Scanner;

public class Temperatura {
	
	double celsius(double f)
	{	
	return  (f-32)*5/9;
	}
	
	public static void main(String[] args) {
		//(ºF - 32) * 5/9 = ºC
		
		double a,c;
 	    	Scanner sc=new Scanner(System.in);	   	 
 	    System.out.println("Insira o Fahrenheit ");
 	    	a=sc.nextDouble();
 	    	Temperatura fah=new Temperatura( );
       double result=fah.celsius(a);	
       		System.out.println("Celsius temperature is = "+result + "ºC.");		  	  	     
	} 	


}
