package MainPackage;

import java.util.Scanner;

public class CheckDigit {
	
	public static void main(String[] args){
		String CCNumber;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Credit Card Number: ");
		CCNumber = input.nextLine();
		
		long SumOne = 0;
		int  SumTwo = 0;
		
		for (int i=CCNumber.length()-2; i>=0; i-=2 ){
	    	int GetSec=2* Character.getNumericValue(CCNumber.charAt(i));
		    	String SDoubled= Integer.toString(GetSec);
			    for (int j=0; j<SDoubled.length(); j++  ){
			    	int GetSec2 = Character.getNumericValue(SDoubled.charAt(j));
			    	SumOne += GetSec2;
			    }
		    }
	    
	    for (int i=CCNumber.length()-1;i>=0;i-=2){
	    	SumTwo = SumTwo + Character.getNumericValue(CCNumber.charAt(i));
	  }
	    int total = (int) (SumOne+SumTwo);

	    if (total%10==0){
	    System.out.println("This is a valid credit card number: #" + CCNumber);
	    }   	  
		
	else{
	    System.out.println("This is an invalid credit card number" + CCNumber );
		}
	}
	
}