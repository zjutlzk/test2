package Test;
import java.util.*;
public class Test4 {
       public static void main(String args[]){
    	   Scanner scanner=new Scanner(System.in);
    	   System.out.println("������һ�����䣺");
    	   int a=0,b=0;
    	  
    		    if(scanner.hasNextInt())
    		   a=scanner.nextInt();
    	   if(scanner.hasNextInt())
    		   b=scanner.nextInt();
    	   
    	  
    	   int count=0;
    	   for(int i=a;i<=b;i++){
    		   if(isPrime(i)==true){
    			   count++;
    		   }
    	   }
    	   System.out.println(a+"��"+b+"��"+count+"������");
       }


static boolean isPrime(int n){
	if(n==1)
		return false;
		for(int i=2;i<=n/2;i++){
		if(n%i==0)
		return false;
	}
		
		return true;
	
}	
}

