package advanced;
import java.util.*;
public class L1005 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s1=scan.nextLine();
		scan.close();
		int sum=0;
		for(int i=0;i<s1.length();i++) {
			sum+=Integer.parseInt(s1.substring(i,i+1));
		}
		String [] a={"zero","one","two","three","four","five","six","seven","eight","nine"};
		String s=sum+"";
		for(int i=0;i<s.length()-1;i++) {
			int m=Integer.parseInt(s.substring(i, i+1));
			System.out.print(a[m]+" ");
		}
		System.out.println(a[Integer.parseInt(s.substring(s.length()-1,s.length()))]);
	}
}
