package advanced;
import java.util.*;
public class L1001 {
	public static void main(String []args) {
	    Scanner scan=new Scanner(System.in); 
	    int a=scan.nextInt();
	    int b=scan.nextInt();
	    scan.close();
	    int c=a+b;
	    if(c>0) {
	      String s=""+c;
	      int yu=s.length()%3;
	      int zheng=s.length()/3;
	      String s1=s.substring(0,yu);
	      for(int i=0;i<zheng;i++) {
	    	if(yu!=0) {
	    		s1=s1+","+s.substring(yu+i*3,yu+(i+1)*3);
	    	}else if(yu==0&&i!=zheng-1){
	    		s1=s1+s.substring(i*3,(i+1)*3)+",";
	    	}else {
	    		s1=s1+s.substring(i*3,(i+1)*3);
	    	}
	        
	      }
	      System.out.println(s1);
	    }else if(c<0) {
	      String s=""+c;
	      int yu=(s.length()-1)%3;
	      int zheng=(s.length()-1)/3;
	      String s1="-"+s.substring(1,yu+1);
	      for(int i=0;i<zheng;i++) {
	    	if(yu!=0) {
	    		s1=s1+","+s.substring(yu+1+i*3,yu+1+(i+1)*3);
	    	}else if(yu==0&&i!=zheng-1){
	    		s1=s1+s.substring(1+i*3,1+(i+1)*3)+",";
	    	}else {
	    		s1=s1+s.substring(1+i*3,1+(i+1)*3);
	    	}
	        
	      }
	      System.out.println(s1);
	    }else {
	      System.out.println(0); 
	    }
	  }
}
