package assignment4;

public class Interest {
       public double Simple_Interest(double p,double t,double r){
    	   return (p*t*r)/100;
       }
       public double Compound_Interest(double p,double t,double r){
    	   return (p*Math.pow(1+(r/100),t));
       }
}
