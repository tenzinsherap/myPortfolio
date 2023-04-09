package labs;

import java.lang.Math;

class Bond {
  //Design a class named Bond to represent a financial bond
	
	
   //Data attributes
	
   private double coupon;
   private int payments;
   private double interest;
   private double valueMaturity;
  
  
   public Bond() {
       coupon = 0;
       payments = 0;
       interest = 0;
       valueMaturity = 0;
   }
  
  
   public Bond(double c, int p, double i, double v) {
       coupon = c;
       payments = p;
       interest = i;
       valueMaturity = v;
   }
  
  
   public double getPrice() {
       double price;
      
       //Applying formula
       price = ( coupon * ( 1 - ( 1 / Math.pow(1+interest, payments) ) ) ) + ( valueMaturity * ( 1 / Math.pow(1+interest, payments) ) );
      
       return price;
   }  
}

