package com.quiz.BarkingDog;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	boolean barking;
    	barking = bark(7);
    	System.out.println( "barking = " + barking );
    }
    
    public static boolean bark (int hourOfDay) {
    	
    	boolean barking; 
    	
    	if (hourOfDay < 8 || hourOfDay > 22)
    		barking = true;
    	else if (hourOfDay < 0 || hourOfDay > 23)
    		barking = false;
    	else 
    		barking = false;
    	
    	return barking;
    	
    	
    }
}
