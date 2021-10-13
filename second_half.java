public class second_half {
		public static void main(String[] args) {
			String s = "Virtusa Training";
			int a=s.length();
			if(s.contains(" ")) 
			{
				String b = s.substring(s.indexOf(" ")+1,a);
				System.out.println(b);
			}
		}
	}