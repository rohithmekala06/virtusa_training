public class first_half_string {
	public static void main(String[] args) {
		String s="Virtusa Training";
		if(s.contains(" ")) 
		{
			String a=s.substring(0,s.indexOf(" "));
			System.out.println(a);
		}
	}
}
