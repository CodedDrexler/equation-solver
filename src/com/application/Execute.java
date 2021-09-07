package com.application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Execute {

	public static void main(String[] args) {	
		execute();	
	}
	
	static void execute() {
	
Scanner sc = new Scanner(System.in);
	
	double a, b, c, delta, x1, x2;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
	
	Date date = new Date(System.currentTimeMillis());
	
	System.out.println("Informe o A:");
	a = sc.nextDouble();
	System.out.println("Informe o B:");
	b = sc.nextDouble();
	System.out.println("Informe o C:");
	c = sc.nextDouble();	
	
	delta = Math.pow(b, 2) -4*a*c;
	
	if (delta < 0) {
		System.out.println("Não existe raiz real ");
			
			 }else {
	x1 = ((-b + Math.sqrt(delta)) / (2 * a));
	x2 = ((-b - Math.sqrt(delta)) / (2 * a));
	
	
	System.out.println("");
	System.out.println("Delta: "+ delta);
	System.out.println("Valor de x': "+x1);
	System.out.println("Valor de x'': "+x2);
	System.out.println("Operação feita em: "+sdf.format(date) +" as "+sdf2.format(date));
	System.out.println("");
	sc.close();
			 	}
			 }
	}
	
	

