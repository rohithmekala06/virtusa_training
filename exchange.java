import java.util.*;
public class exchange {
	public static void main(String[] args) {
		String a="Virtusa";
		char[] b=a.toCharArray();
		int c=b[0];
		int d=b[1];
		b[0]=b[2];
		b[1]=b[3];
		b[2]=(char)c; 
		b[3]=(char)d;
		System.out.println(b);
	}
}
