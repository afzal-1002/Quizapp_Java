package datastructure_and_algorithm;

public class BinaryToDecimle {
	
	public static int convertToDecimal(String binary) {
		int conversion = 1;
		int result = 0;
		
		for (int i = 0; i <= binary.length(); i++) {		
			if(binary.charAt(binary.length()-i) == '1'){
				result += conversion;				
				conversion *= 2;
			}					
		}	
	
		return result;
	}
	
	public static int convertToDecimalAlt(String binary) {
		int conversion = 1;
		int result = 0;
		
		for (int i = 0; i <= binary.length(); i++) {		
			if(binary.charAt(binary.length()-i) == '1'){
				result += Math.pow(2, i-1);				
				
			}					
		}	
	
		return result;
	}

	public static void main(String[] args) {
		BinaryToDecimle bin = new BinaryToDecimle();
//		System.out.println(bin.convertToDecimal( "10110"));
		System.out.println(bin.convertToDecimalAlt( "10110"));
		
		

	}

}
