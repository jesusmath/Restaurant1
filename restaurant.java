import java.util.Scanner;
public class restaurant{

    public static void main (String args[]) {
    	int n, m, p,t, zipcode;
    	Scanner input = new Scanner(System.in);
    	System.out.println ("Hello. Do you want your order to be picked-up or delivered?" );
    	String choice = input.nextLine(); 
    	if ("delivery".equalsIgnoreCase(choice)) {
    		
    		System.out.println ("What is your zip code");
    	    zipcode=input.nextInt();
    	    input.nextLine();
    	    if (zipcode>=23447 && zipcode<=23457) {
    	    	if(zipcode==23447|| zipcode==23457) {
    	    	  System.out.println ("Delivery available with extra cost");
    	          System.out.println ("How many Burger do you want");
    	          n = input.nextInt(); 
    	          input.nextLine();
    	          System.out.println ("How many cups of Drink do you want");
    	          m = input.nextInt();
    	          input.nextLine();
    	          System.out.println ("How many Fries do you want");
    	          p = input.nextInt();
    	          input.nextLine();
    	          System.out.println ("How many Dessert do you want");
    	          t = input.nextInt();
    	          input.nextLine();
    	          System.out.println ("Thank you. Your total bill is $"+ (4.5*n+1.5*m+2.5*p+3*t)*1.05 + 7);
    	    	}
    	    	else {
    	    	  System.out.println ("Delivery available");
      	          System.out.println ("How many Burger do you want");
      	          n = input.nextInt(); 
      	          input.nextLine();
      	          System.out.println ("How many cups of Drink do you want");
      	          m = input.nextInt();
      	          input.nextLine();
      	          System.out.println ("How many Fries do you want");
      	          p = input.nextInt(); 
      	          input.nextLine();
      	          System.out.println ("How many Dessert do you want");
      	          t = input.nextInt();
      	          input.nextLine();
      	          System.out.println ("Thank you. Your total bill is $"+ (4.5*n+1.5*m+2.5*p+3*t)*1.05 + 5);
    	    	   }
    	    }
    	    else
    	     System.out.println ("Delivery not available");  
    	}
    	    
    	if ("pick-up".equalsIgnoreCase(choice)) {
    	   System.out.println ("How many Burger do you want");
    	   n = input.nextInt(); 
    	   input.nextLine();
	       System.out.println ("How many cups of Drink do you want");
	       m = input.nextInt();
	       input.nextLine();
	       System.out.println ("How many Fries do you want");
	       p = input.nextInt();
	       input.nextLine();
	       System.out.println ("How many Dessert do you want");
	       t = input.nextInt(); 
	       input.nextLine();
	       System.out.println ("Thank you. Your total bill is $"+ (4.5*n+1.5*m+2.5*p+3*t)*1.05);   
    	  }
    	
       }
   }
    	    
    	  
      	          
      	          
      	          
      	          
      	           


