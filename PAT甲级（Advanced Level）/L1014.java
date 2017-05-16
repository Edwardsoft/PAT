package advance;

import java.util.*;
public class L1014 {
	static int N,M,K,Q;
	static int []serveTime;
	static int []queryId;
	static ArrayList<ArrayDeque<Integer>> queuein;
	static ArrayDeque<Integer> queueout;
	static int []beginTime;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String []s=scan.nextLine().split(" ");
		N=Integer.parseInt(s[0]);
		M=Integer.parseInt(s[1]);
		K=Integer.parseInt(s[2]);
		Q=Integer.parseInt(s[3]);
		serveTime=new int [K];
		queuein=new ArrayList<>();
		beginTime=new int [K];
		for(int i=0;i<N;i++) {
			ArrayDeque<Integer> arrayDeque=new ArrayDeque<>();
			queuein.add(arrayDeque);
		}
		for(int i=0;i<K;i++) {
			beginTime[i]=540;
		}
		queueout=new ArrayDeque<>();
		for(int i=0;i<K;i++) {
			serveTime[i]=scan.nextInt();
			if(i<N*M) {
				if(i<N) {
					beginTime[i]=0;
				}
				queuein.get(i%N).add(i);
			}else {
				queueout.add(i);
			}
		}
		
		for(int i=0;i<540;i++) {
			for(int j=0;j<N;j++) {
				if(!queuein.get(j).isEmpty()) {
					int id=queuein.get(j).getFirst();
					if(i==serveTime[id]+beginTime[id]) {
						queuein.get(j).remove();
						if(!queueout.isEmpty()) {
							int id1=queueout.remove();
							queuein.get(j).add(id1);
						}
						if(!queuein.get(j).isEmpty()) {
							beginTime[queuein.get(j).getFirst()]=i;
						}
					}
				}
				
			}
		}	
		for(int i=0;i<Q;i++) {
			int id=scan.nextInt()-1;
			if(beginTime[id]>=540) {
				System.out.println("Sorry");
			}else {
				int endTime=serveTime[id]+beginTime[id];
				int hour=endTime/60+8;
				int minute=endTime%60;
				String hours,minutes;
				if(hour<10) {
					hours="0"+hour;
				}else {
					hours=""+hour;
				}
				if(minute<10) {
					minutes="0"+minute;
				}else {
					minutes=""+minute;
				}
				System.out.println(hours+":"+minutes);
			}
			
		}
		scan.close();
	}
}
