package selflearning.first;
import java.util.*;
public class Main 
{


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter val1: ");
		String s1 = input.next();
		float val1 =  Float.parseFloat(s1);  
		System.out.println("Enter val2: ");
		String s2 = input.next(); 
		float val2 =  Float.parseFloat(s2);
		float ans = val1 + val2;
		System.out.println("The answer is "+ans);
	}
			
}

