package Test;
import java.util.*;
import java.math.*;
public class Test3 {
public static void main(String args[]){
	Scanner scanner=new Scanner(System.in);
	int num=(int)Math.floor(Math.random()*100+1);
	System.out.println("有一个1-100之间的随机整数，请您猜猜看：");
	System.out.println("请输入您的猜测：");
	int chioce=0;
	while(scanner.hasNextInt()){
		chioce=scanner.nextInt();
		if(chioce<num)
			System.out.println("你猜小了，请继续猜：");
		if(chioce>num)
			System.out.println("你猜大了，请继续猜：");
		if(chioce==num)
			System.out.println("恭喜你，猜对了！");
		
	}
}
}
