package com.practice;

public class AnimalPra {

public void getsalary(){//(1)this is void method return 
	
	System.out.println("1 this is my first java class");

	}

 public static void getMoney(){//(2)static void method 
	System.err.println("2 this is static void method");

    }
 //(3)return method i have to mention what type of return it is
 //integer,double,string,
//when i create a return method i have to  write.return word 
//befour moody carlibraket

 public int getcar(){

System.out.println("3 this is integer return method ");
	
return 100;	
  
 }
 public double carwash(){//(4)double re method 
//double re me
	 System.out.println("4 this is double return method");
return 100.20;
 
 }//(5)this is string return  method
 
public String sellmycar(){
	
	System.out.println("5 please sell my car");
	return"waris";
}
 //(6)String type of method i want to use static word so
public static String sellthiscar(){
	
	System.out.println("6 static string return ");
	
	return"waris12.23";
}
              
          /////// Variable method///////
               //(7)local variable//
public void getvariable() {//if i create a variable inside the method.
	//this is local variable.
	int a=500;
	System.out.println(a);//this is integer variable
}
            ///(8)Global variable ///
//Global variable is inside the class outside of method.
//Global variable Two type if Static word not there 
//this name is INSTANCE,if STATIC word there this name is 
//global static (local dont't have static or instance type )

public int numner = 10;  //This is instance global  variable.

public static String name = "waris";//this static global variable.

public void getglobalvariable() {

	System.out.println("(8)this is global variable");
}//this is method
        
 ////(9)dynamic coding passing parameter and argument /////

public void getsalarytype(int  a){//this name is parameter.

	//int a=20000;
System.out.println(a);
	}


public void getmyname(String b){//his name is parameter.
	
	//String b="waris";
	
	System.out.println(b);

}
public void getsalary(int a,double b,String c){//this is method body  
    //int a=200;
	//double b = 300.30;
	//String c ="dynamic" ;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
}
}//end class

