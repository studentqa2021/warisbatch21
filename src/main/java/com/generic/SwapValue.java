package com.generic;

public class SwapValue {
    //what is swap? swap is opposite the value.
	//like a=10,b=20 so opposite should be a=20,b=10;;
	////swap formula is/// 
    //a=a+b;//a=10+20=30;
	//b=a-b;//b=30-20=10;
	//a=a-b;//a=30-10=20;

	static int a=10;//this is Global swap value 
	static int b=20;//this is Global swap value 
		
   
	public static void main(String[] args) {
        
		//int a=10;//this is local swap value 
		 //int b=20;//this is local swap value 
			
     	a = a+b;
		b = a-b;
		a = a-b;
	
	System.out.println(a);//my expectation is a=20
	System.out.println(b);//my expectation is b=10
	
	
	}
	
}
