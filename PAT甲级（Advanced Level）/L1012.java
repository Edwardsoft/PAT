package advanced;
import java.util.*;
public class L1012 {

	
	
	public static void main(String[] args) {
		int n,m;
		Scanner scan=new Scanner(System.in);
		String []s=scan.nextLine().split(" ");
		n=Integer.parseInt(s[0]);
		m=Integer.parseInt(s[1]);
		String []total=new String [n];
		int [][]data=new int [n][8];
		for(int i=0;i<n;i++) {
			s=scan.nextLine().split(" ");
			total[i]=s[0];
			for(int j=1;j<4;j++) {
				data[i][j]=Integer.parseInt(s[j]);
			}
			data[i][0]=(int)((data[i][1]+data[i][2]+data[i][3])/3.0+0.5);
		}
		
		int prev1=101,prev2=101,prev3=101,prev4=101;
		int prevs1=0,prevs2=0,prevs3=0,prevs4=0;
		for(int i=1;i<=n;i++) {
			int max=0;
			int flag=0;
			for(int j=0;j<n;j++) {
				if(data[j][0]>max&&data[j][4]==0) {
					max=data[j][0];
					flag=j;
				}
			}
			if(max<prev1) {
				data[flag][4]=i;
				prev1=max;
				prevs1=i;
			}else {
				data[flag][4]=prevs1;
			}
			
			flag=0;
			max=0;
			for(int j=0;j<n;j++) {
				if(data[j][1]>max&&data[j][5]==0) {
					max=data[j][1];
					flag=j;
				}
			}
			if(max<prev2) {
				data[flag][5]=i;
				prev2=max;
				prevs2=i;
			}else {
				data[flag][5]=prevs2;
			}
			flag=0;
			max=0;
			for(int j=0;j<n;j++) {
				if(data[j][2]>max&&data[j][6]==0) {
					max=data[j][2];
					flag=j;
				}
			}
			if(max<prev3) {
				data[flag][6]=i;
				prev3=max;
				prevs3=i;
			}else {
				data[flag][6]=prevs3;
			}
			flag=0;
			max=0;
			for(int j=0;j<n;j++) {
				if(data[j][3]>max&&data[j][7]==0) {
					max=data[j][3];
					flag=j;
				}
			}
			if(max<prev4) {
				data[flag][7]=i;
				prev4=max;
				prevs4=i;
			}else {
				data[flag][7]=prevs4;
			}
		}
		for(int i=0;i<m;i++) {
			String id=scan.nextLine();
			int flag=0;
			for(int j=0;j<n;j++) {
				if(id.equals(total[j])) {
					int min=n;
					int mins=7;
					for(int k=7;k>=4;k--) {
						if(min>=data[j][k]) {
							min=data[j][k];
							mins=k;
						}
					}
					System.out.print(min+" ");
					if(mins==4) {
						System.out.println("A");
					}else if(mins==5) {
						System.out.println("C");
					}else if(mins==6) {
						System.out.println("M");
					}else if(mins==7) {
						System.out.println("E");
					}
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println("N/A");
			}
		}
	}
}
