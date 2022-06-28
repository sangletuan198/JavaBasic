package day1;

import java.util.Scanner;

public class DataTypesAndVariables { 
	
	public static void printMessage(String message) {
	     System.out.println(message);  
	    }  
	
	//-----------------------------------------------------------------
	
	public static void printVariable() {
		byte a =10;
		float b = 20.3f;
		float c = 3.14785f;
		System.out.println("print a: " + a);
		System.out.println("print b: " + b);
		System.out.println("print c: " + c);
	}
	
	//---------------------------------------------------------------------
	
	public static void printBooleanVariable(Boolean myBool){				
		if (myBool == true) {
							System.out.println("my Bool = false" );												
							} 
		if (myBool == false) {
			System.out.println("my Bool = true" );												
			} 	
			
	}
	
	//------------------------------------------------------------------
	/*
	public static void converseTemperature() {
		while (true) {
			
			System.out.println("nhap nhiet do can chuyen doi:");
			String inputTemp = System.console().readLine();
			
			if ("thoat".equals(inputTemp)) {
				System.out.println("thoat");
				System.exit(0);
				}
			double inputTemp2 = Double.parseDouble(inputTemp);
			double b = 0.556;
			double outputTemp = (double)(inputTemp2*b);
			System.out.println("nhiet do da chuyen doi" + outputTemp );		
			  
		}
	}
	*/
	//------------------------------------------------------------------
	public static void converseMeter() {
		Scanner scan = new Scanner(System.in);
		System.out.println("nhap gia tri inch");
		int x = scan.nextInt();
		int y = (int)(x+0.0254);
		System.out.println("gia tri chuyen sang met la " + y);
	}
	
}

