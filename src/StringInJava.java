
public class StringInJava {

	public static void main(String[] args) {
		
		String s = "Welcome to selenium Tran ing";
		
	    String s1= "  Welcome ";
	    
		
		System.out.println(s.length());
		
		System.out.println(s.charAt(2));
		
		System.out.println(s1.equals(s));   // it will compare both the string if same get as true or different getting as false
		System.out.println(s.indexOf("t"));
		System.out.println(s.contains("Welcome"));
		System.out.println(s.compareTo("Welcome to selenium ")); // both are equal get as result 0
		System.out.println(s.concat(" hello"));  //adding to existing string at end
		System.out.println(s.substring(2));     // removing the starting letters here we given 2 so first two letters will be removed
		System.err.println(s.substring(3,8 ));  // it will print the 3 to 8 letters result as "come"
		System.out.println(s1);
		System.out.println(s1.trim()); // it will remove the spaces in stating and ending
		
		
		String [] a= s.split(" ");    //it will split the word where spaces are there 
		for(String x:a) {
			System.out.println(x);
		}
		
		
		

	}

}
