package advance;
import java.util.*;
public class L1016 {
	static int []billsrate;
	static int N;
	static int month;
	static HashMap<String,ArrayList<String []>> datas;
	static HashMap<String,ArrayList<String>> outputs;
	static String [][]name;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<24;i++) {
			billsrate[i]=scan.nextInt();
		}
		N=scan.nextInt();
		scan.nextLine();
		ArrayList<String []> list;
		for(int i=0;i<N;i++) {
			String []s=scan.nextLine().split(" ");
			if(datas.containsKey(s[0])) {
				list=datas.get(s[0]);
			}else {
				list=new ArrayList<>();
			}
			String []s1=s[1].split(":");
			month=Integer.parseInt(s1[0]);
			String [] s2=new String[6];
			s2[0]=s1[1];
			s2[1]=s1[2];
			s2[2]=s1[3];
			s2[3]=s[2];
			list.add(s2);
			datas.put(s[0], list);
		}
		Iterator iterator=datas.entrySet().iterator();
		name=new String[2][datas.size()];
		int k=0;
		while(iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			ArrayList<String []> data=(ArrayList<String []>)entry.getValue();
			
			name[0][k]=(String)entry.getKey();
			k++;
			while(true) {
				int min1=0;
				int min2=0;
				for(int i=1;i<data.size();i++) {
					if(!data.get(i)[4].equals("true")) {
						if(data.get(i)[3].equals("on-line")) {
							String []s1=data.get(min2);
							String []s2=data.get(i);
							if(Integer.parseInt(s1[0])>Integer.parseInt(s2[0])) {
								min1=i;
							}else if(Integer.parseInt(s1[0])==Integer.parseInt(s2[0])) {
								if(Integer.parseInt(s1[1])>Integer.parseInt(s2[1])) {
									min1=i;
								}else if(Integer.parseInt(s1[1])==Integer.parseInt(s2[1])) {
									if(Integer.parseInt(s1[2])>Integer.parseInt(s2[2])) {
										min1=i;
									}
								}
							}
						}
					}
				}
				
				for(int i=1;i<data.size();i++) {
					if(!data.get(i)[4].equals("true")) {
						if(data.get(i)[3].equals("off-line")) {
							String []s1=data.get(min1);
							String []s2=data.get(i);
							if(Integer.parseInt(s1[0])>Integer.parseInt(s2[0])) {
								min2=i;
							}else if(Integer.parseInt(s1[0])==Integer.parseInt(s2[0])) {
								if(Integer.parseInt(s1[1])>Integer.parseInt(s2[1])) {
									min2=i;
								}else if(Integer.parseInt(s1[1])==Integer.parseInt(s2[1])) {
									if(Integer.parseInt(s1[2])>Integer.parseInt(s2[2])) {
										min2=i;
									}
								}
							}
						}
					}
				}
				if(min2!=min1) {
					data.get(min2)[4]="true";
				}else {
					break;
				}
				
				int day=Integer.parseInt(data.get(min2)[0])-Integer.parseInt(data.get(min1)[0]);
				int hour=Integer.parseInt(data.get(min2)[1])-Integer.parseInt(data.get(min1)[1]);
				int minute=Integer.parseInt(data.get(min2)[2])-Integer.parseInt(data.get(min1)[2]);
				int sum=day*24*60+hour*60+minute;
				
				String s=data.get(min1)[0]+":"+data.get(min1)[1]+":"+data.get(min1)[2]+" "+data.get(min2)[0]+":"+data.get(min2)[1]+":"+data.get(min2)[2]
				
			}

		}
		
		
	}
	
}
