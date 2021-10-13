public class string_palindrome {
	public static void main(String[] args) {
		String a="Virtusa";
		String b="racecar";
		StringBuffer c=new StringBuffer(a);
		StringBuffer d=new StringBuffer(b);;
		c.reverse();
		d.reverse();
		String e=c.toString();
		String f=d.toString();		System.out.println("Reverse of "+a+" is "+e+"\n"+"Palindrome? "+a.equals(e));
		System.out.println("Reverse of "+b+" is "+f+"\n"+"Palindrome? "+b.equals(f));
	}
}
