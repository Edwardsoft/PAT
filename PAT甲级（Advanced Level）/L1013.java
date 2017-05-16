package advanced;
import java.util.*;
public class L1013 {
	static int [][]road;
	static boolean [] visit;
	static int N,M,K;
	public static void dfs(int node) {
	    visit[node] = true;
	    for(int i = 0; i < N; i++) {
	        if(visit[i] == false && road[node][i] == 1)
	            dfs(i);
	    }
	}
//	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		String []s=scan.nextLine().split(" ");
//		N=Integer.parseInt(s[0]);
//		M=Integer.parseInt(s[1]);
//		K=Integer.parseInt(s[2]);
//		road=new int [N][N];
//		visit=new boolean[N];
//		for(int i=0;i<M;i++) {
//			s=scan.nextLine().split(" ");
//			road[Integer.parseInt(s[0])-1][Integer.parseInt(s[1])-1]=road[Integer.parseInt(s[1])-1][Integer.parseInt(s[0])-1]=1;
//		}
//		for(int i = 0; i < K; i++) {
//			visit=new boolean[N];
//			int a=scan.nextInt()-1;
//	        int cnt = 0;
//	        visit[a] = true;
//	        for(int j = 0; j <N; j++) {
//	            if(visit[j] == false) {
//	                dfs(j);
//	                cnt++;
//	            }
//	        }
//	        System.out.println(cnt - 1);
//	    }
//		scan.close();
//	}
	
	
	
	
	static void makeset(int num){
	    int i;
	    for(i=0;i<=num;i++)
	        father[i]=i;
	}
	static int findset(int x){
	    if(x!=father[x]) father[x]=findset(father[x]);
	    return father[x];
	}
	static void joinset(int x,int y){
	    x=findset(x);
	    y=findset(y);
	    if(x==y) return ;
	    else{
	        father[y]=x;
	    }
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String []s=scan.nextLine().split(" ");
		N=Integer.parseInt(s[0]);
		M=Integer.parseInt(s[1]);
		K=Integer.parseInt(s[2]);
		road=new int [N][N];
		visit=new boolean[N];
		for(int i=0;i<M;i++) {
			s=scan.nextLine().split(" ");
			road[Integer.parseInt(s[0])-1][Integer.parseInt(s[1])-1]=road[Integer.parseInt(s[1])-1][Integer.parseInt(s[0])-1]=1;
		}
		
	}
}
