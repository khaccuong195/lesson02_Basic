package Cuong.dev;

public class Basic {
	public static void main(String[] agrs) {
		double a=-5;
		   double b=-4;
		   double c=1;
		   double x,x1,x2,delta;
		   delta = (b*b)-(4*a*c);
		   if(delta>0) {
			   x1=((-b-Math.sqrt(delta))/(2*a));
			   System.out.println("nghiem x1:"+x1);
			   x2=((-b+Math.sqrt(delta))/(2*a));
			   System.out.println("nghiem x2:"+x2);
		   }
		   else if(delta<0) {
			   System.out.println("phuong trinh vo ngiem");
		   }
		   else if(delta==0) {
			   x=-b/(2*a);
			   System.out.println("nghiem kep x"+x);
		   }
	   }
}  
