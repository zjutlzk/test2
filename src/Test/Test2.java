package Test;
import java.util.Scanner;

public class Test2 {
	public static void main(String args[]){
	     Rectangle a=new Rectangle();
	     System.out.println("�޲��ܳ��ǣ�"+a.perimeter());
	     System.out.println("����ǣ�"+a.area());
	     Rectangle b=new Rectangle(1,1);
	     System.out.println("�в��ܳ��ǣ�"+b.perimeter());
	     System.out.println("����ǣ�"+b.area());
	     
	}
}

	class Rectangle{
	    double length,width;
	    
		Rectangle(){
			double alength;
			double awidth;
			alength=1;
			awidth=1;
			length=alength;
			width=awidth;
		}
		Rectangle(double alength,double awidth){
			length=alength;
			width=awidth;			
		}
		public double perimeter(){
			return (length+width)*2;
		}	
		public double area(){
			return length*width;
		}
	}
	