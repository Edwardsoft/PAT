package advanced;
import java.util.*;
public class L1006 {
	static String []name;
	static String []in;
	static String []out;
	static int min=0;
	static int max=0;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=Integer.parseInt(scan.nextLine());
		name=new String [n];
		in=new String [n];
		out=new String [n];
		for(int i=0;i<n;i++) {
			String []s=scan.nextLine().split(" ");
			name[i]=s[0];
			in[i]=s[1];
			out[i]=s[2];
		}
		scan.close();
		for(int i=1;i<n;i++) {
			bijiao(i);
		}
		System.out.println(name[min]+" "+name[max]);
	}
	static void bijiao(int index) {
		String []s1=in[min].split(":");
		String []s2=in[index].split(":");
		if(Integer.parseInt(s1[0])>Integer.parseInt(s2[0])) {
			min=index;
		}else if(Integer.parseInt(s1[0])==Integer.parseInt(s2[0])) {
			if(Integer.parseInt(s1[1])>Integer.parseInt(s2[1])) {
				min=index;
			}else if(Integer.parseInt(s1[1])==Integer.parseInt(s2[1])) {
				if(Integer.parseInt(s1[2])>Integer.parseInt(s2[2])) {
					min=index;
				}
			}
		}
		s1=out[max].split(":");
		s2=out[index].split(":");
		if(Integer.parseInt(s1[0])<Integer.parseInt(s2[0])) {
			max=index;
		}else if(Integer.parseInt(s1[0])==Integer.parseInt(s2[0])) {
			if(Integer.parseInt(s1[1])<Integer.parseInt(s2[1])) {
				max=index;
			}else if(Integer.parseInt(s1[1])==Integer.parseInt(s2[1])) {
				if(Integer.parseInt(s1[2])<Integer.parseInt(s2[2])) {
					max=index;
				}
			}
		}
	}
	
	
}
