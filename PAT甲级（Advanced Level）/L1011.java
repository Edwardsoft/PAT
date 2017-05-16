package advanced;
import java.math.BigDecimal;
import java.util.*;
public class L1011 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double sum=1.0;
		for(int i=0;i<3;i++) {
			String []s=scan.nextLine().split(" ");
			int m=0;
			for(int j=0;j<s.length;j++) {
				if(Double.parseDouble(s[m])<Double.parseDouble(s[j])) {
					m=j;
				}
			}
			sum*=Double.parseDouble(s[m]);
			if(m==0) {
				System.out.print("W ");
			}else if(m==1) {
				System.out.print("T ");
			}else {
				System.out.print("L ");
			}
		}
		scan.close();
		sum=(sum*0.65-1)*2;
		BigDecimal bg = new BigDecimal(sum);
        double f1 = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(f1);
	}
}
