
public class StringBufferInJava {
	
	
	public static void main(String[] args) {
		
		StringBuffer sb =new StringBuffer("Welcome to selenium");
		
		System.out.println(sb.capacity()); // string buffer always have extra 16 characters space 19+16=35
		
		System.out.println(sb.length()); // length will be actual value will come as 19
		
		System.out.println(sb.insert(5, false)); //in 5the digit enter as false here instead of false we can enter any words
		
		System.out.println(sb.delete(5, 8)); // in the string remove the 5th to 8th letters 
		
		System.out.println(sb.append("hi")); //it will print hi in last or end of the string
		
		System.out.println(sb.replace(3, 8, "GNR")); //it will insert the GNR in 3rd position
		System.out.println(sb.reverse()); // it will reverse the string
		
		
		
	}

}
