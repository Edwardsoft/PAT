package advanced;
import java.util.*;
public class L1004 {
	

//自己的解法
	
	
//	static HashMap<String, String[]> s1=new HashMap<>();
//	static int []a;
//  	static int max;
//	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		String []s=scan.nextLine().split(" ");
//		int n=Integer.parseInt(s[0]);
//		int m=Integer.parseInt(s[1]);
//    	if(m<0) {
//        		return ;
//            }
//		if(m==0) {
//                  System.out.println("1");
//                  return;
//		}
//		a=new int[m+1];
//		for(int i=0;i<m;i++) {
//			s=scan.nextLine().split(" ");
//			int k=Integer.parseInt(s[1]);
//			String []s2=new String[k];
//			for(int j=0;j<k;j++) {
//				s2[j]=s[2+j];
//			}
//			s1.put(s[0],s2);
//		}
//		scan.close();
//		chizhao(0,"01");
//		System.out.print(a[0]);
//		for(int i=1;i<=max;i++) {
//			System.out.print(" "+a[i]);
//		}
//		
//	}
//	static void chizhao(int i,String name) {
//        if(i>max) {
//          	max=i; 
//        }
//		if(s1.containsKey(name)) {
//			String []s=s1.get(name);
//			for(int j=0;j<s.length;j++) {
//				chizhao(i+1,s[j]);
//			}
//		}else {
//			a[i]++;
//		}
//	}
	
	
//DFS解法
	
	static int []a;
	static HashMap<String, String[]> s1=new HashMap<>();
	static int maxDepth;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String []s=scan.nextLine().split(" ");
		int n=Integer.parseInt(s[0]);
		int m=Integer.parseInt(s[1]);
    	if(m<0) {
    		return ;
        }
		if(m==0) {
			System.out.println("1");
			return;
		}
		a=new int[m+1];
		for(int i=0;i<m;i++) {
			s=scan.nextLine().split(" ");
			int k=Integer.parseInt(s[1]);
			String []s2=new String[k];
			for(int j=0;j<k;j++) {
				s2[j]=s[2+j];
			}
			s1.put(s[0],s2);
		}
		scan.close();
		dfs(0,"01");
		System.out.print(a[0]);
		for(int i=1;i<=maxDepth;i++) {
			System.out.print(" "+a[i]);
		}
	}
	public static void dfs(int depth,String index) {
		
		if(s1.containsKey(index)) {
			String []s=s1.get(index);
			for(int j=0;j<s.length;j++) {
				dfs(depth+1,s[j]);
			}
		}else {
			if(depth>maxDepth) {
				maxDepth=depth;
			}
			a[depth]++;
		}
	}
	
}
