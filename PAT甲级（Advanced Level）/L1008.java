package advanced;
import java.util.*;
public class L1008 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int sum=0,now=0;
		String []s=scan.nextLine().split(" ");
		scan.close();
		for(int i=0;i<s.length;i++) {
			int num=Integer.parseInt(s[i]);
			if(num>now) {
				sum=sum+6*(num-now);
			}else{
				sum=sum+4*(now-num);
			}
			now=num;
			sum+=5;
			System.out.println(sum);
		}

	}
}
