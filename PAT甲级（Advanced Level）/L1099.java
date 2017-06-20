package advanced;
import java.util.*;
public class L1099 {
	
	public static int [][]tree;
	public static int [] val;
	public static int now;
	public static int n;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		tree=new int [n][3];
		val=new int [n];
		for(int i=0;i<n;i++) {
			tree[i][0]=scan.nextInt();
			tree[i][1]=scan.nextInt();
			
		}
		for(int i=0;i<n;i++) {
			val[i]=scan.nextInt();
		}
		scan.close();
		
		Arrays.sort(val);
		bianli(0);
		ArrayList<Integer> none=new ArrayList<>();
		System.out.print(tree[0][2]);
		if(tree[0][0]!=-1) {
			none.add(tree[0][0]);
		}
		if(tree[0][1]!=-1) {
			none.add(tree[0][1]);
		}
		now=1;
		for(int i=0;i<none.size();i++) {
			if(tree[none.get(i)][0]!=-1) {
				none.add(tree[none.get(i)][0]);
			}
			if(tree[none.get(i)][1]!=-1) {
				none.add(tree[none.get(i)][1]);
			}
			System.out.print(" "+tree[none.get(i)][2]);
		}
		
		
		
	}
	public static void bianli(int index) {
		if(tree[index][0]!=-1) {
			bianli(tree[index][0]);
		}
		tree[index][2]=val[now];
		now++;
		if(tree[index][1]!=-1) {
			bianli(tree[index][1]);
		}
	}

}
