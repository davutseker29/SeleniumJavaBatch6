package com.syntax.practice;
	
class Main {
	
 public static void gradeCheck(int grade) {
		 
		 if(grade>90) {
			 throw new SyntaxStudentException("You are an exceptionally awesome student");
		 }else {
			 System.out.println("You are a great student");
		 }
		 	 
	 }
 public static void main(String []args) {
		
//		NullPointerException npe=new NullPointerException();
		
		 try {
			  gradeCheck(97);
		  }catch(SyntaxStudentException e) {
			  System.out.println(e);
		  }
	  }
	  }

	class SyntaxStudentException extends RuntimeException{
		
		SyntaxStudentException(String message){
	
		super(message);
	}}

	  
		  
		  
		  
		 
		  
	  
	  
	
	  
	  
	  