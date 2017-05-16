package advanced;
import java.util.*;
public class L1007 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=Integer.parseInt(scan.nextLine());
		int []a=new int [n];
		int sum=-1,temp=0,left=0,right=0,tempindex=0,flag=0;
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
			temp=temp+a[i];
			if(a[i]>=0) {
				flag=1;
			}
			if(temp>sum) {
				sum=temp;
				left=tempindex;
				right=i;
			}else if(temp<0) {
				temp=0;
				tempindex=i+1;
			}
		}
		scan.close();
		if(flag==0) {
			System.out.println("0 "+a[0]+" "+a[n-1]);
		}else {
			System.out.println(sum+" "+a[left]+" "+a[right]);
		}
	}
	
}
