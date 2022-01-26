package selflearning.first;
import java.util.*;
public class littlecomplexcal
{
	    static String getInput(String msg){
	        System.out.print(msg);
	        Scanner sc = new Scanner(System.in);
	        return sc.nextLine();
	    }
	    public static void main(String[] args){
	        String s1 = getInput("Enter First Value: ");
	        String s2 = getInput("Enter Second Value: ");
	        String s3 = getInput("Enter +,-,*,/ : ");

	        double result = 0;

	        try{
	            switch (s3){
	                case "+":
	                    result = doubleSum(s1,s2);
	                    break;
	                case "-":
	                    result = doubleSub(s1,s2);
	                    break;
	                case "*":
	                    result = doubleMul(s1,s2);
	                    break;
	                case "/":
	                    result = doubleDiv(s1,s2);
	                    break;
	                default:
	                    System.out.println("Unrecognised Operation");
	                    break;
	            }
	            System.out.println(result);
	        } catch (Exception e) {
	            System.out.println("Number format eer "+e.getMessage());
	        }



	    }
	    static double doubleSum(String s1, String s2){
	        double d1 = Double.parseDouble(s1);
	        double d2 = Double.parseDouble(s2);
	        return d1+d2;
	    }
	    static double doubleSub(String s1, String s2){
	        double d1 = Double.parseDouble(s1);
	        double d2 = Double.parseDouble(s2);
	        return d1-d2;
	    }
	    static double doubleMul(String s1, String s2){
	        double d1 = Double.parseDouble(s1);
	        double d2 = Double.parseDouble(s2);
	        return d1*d2;
	    }
	    static double doubleDiv(String s1, String s2){
	        double d1 = Double.parseDouble(s1);
	        double d2 = Double.parseDouble(s2);
	        return d1/d2;
	    }
	}

