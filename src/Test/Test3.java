package Test;
import java.util.*;
import java.math.*;
public class Test3 {
public static void main(String args[]){
	Scanner scanner=new Scanner(System.in);
	int num=(int)Math.floor(Math.random()*100+1);
	System.out.println("��һ��1-100֮�����������������²¿���");
	System.out.println("���������Ĳ²⣺");
	int chioce=0;
	while(scanner.hasNextInt()){
		chioce=scanner.nextInt();
		if(chioce<num)
			System.out.println("���С�ˣ�������£�");
		if(chioce>num)
			System.out.println("��´��ˣ�������£�");
		if(chioce==num)
			System.out.println("��ϲ�㣬�¶��ˣ�");
		
	}
}
}
