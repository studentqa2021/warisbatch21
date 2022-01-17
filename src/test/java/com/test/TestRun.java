package com.test;

import com.practice.AnimalPra;

public class TestRun {

public static void main(String[] args) {
	//how to call method
	//if  method don't have static word i need to create a object
	//(how to create a object)//object is
	//class name (AnimalPro obj=new AnimalPra();
	//obj.method name
	AnimalPra obj=new AnimalPra();
	  //this is [AnimalPra()]
	obj.getsalary();
   
	//(2) this method have static word so need to object.
	//call out classNmae . methodName
	AnimalPra.getMoney();
     
	//(3)integer type of return method call out 
	obj.getcar();

    //(4)double 
    obj.carwash();
    
    //(5)string type of return method call out
    obj.sellmycar();

   //(6)static String type of return method call out
     AnimalPra.sellthiscar();
   
     //(7)Local variable //
    obj.getvariable();
    //(8) global variable call//
    obj.getglobalvariable();
     
    ////(9) dynamic coding ////
   obj.getsalarytype(20000); //integer
   obj.getmyname("this is dynamic coding"); 
   //when changing the value inside main method call is dynamic coding. 
   obj.getsalary(200, 300.30,"dynamic coding");


  }

}//end class
