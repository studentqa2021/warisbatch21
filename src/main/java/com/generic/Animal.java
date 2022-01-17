package com.generic;

public class Animal {
public void getsalary(int a,double b,String c){//this is method body  
    //int a=200;
	//double b = 300.30;
	//String c ="dynamic" ;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
}

public static void main(String[] args) {//this is main method
	
Animal obj = new Animal();


obj.getsalary(200,300.30,"Dynamic coding");

}


}//end class
