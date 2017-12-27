package CTCi;

public class URLify {

	public static void main(String[] args) {
	
		String x = "a  bc  ";
		
		System.out.println(x.length());
		String x1 = x.trim().replaceAll(" ", "%20");
		System.out.println(x1);
	
	}
	
}
