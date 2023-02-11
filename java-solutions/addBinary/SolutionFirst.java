package addBinary;


//wrong answer input a=11 b=1, output=1100 expected=100
public class SolutionFirst {
	public String addBinary(String a, String b) {
		int binA=Integer.parseInt(a);
		int binB=Integer.parseInt(b);
		int decimalResult=binA+binB;
		String binaryResult=Integer.toBinaryString(decimalResult);
		return binaryResult;
	}
}
