package p1;

public class P1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rekusiv(5,2));
		System.out.println(iterativ(5,2));
	}

	private static int rekusiv(int basis, int exponent) {
		if (exponent == 0) {
			return 1; 
		}
		return basis * rekusiv(basis, exponent -1);
		
	/*	int temp = 1; 
		if (exponent != 0) {
			exponent--;
			temp = temp * basis *rekusiv(basis, exponent);
		} 
		return temp;*/
	}
	
	private static int iterativ(int basis, int exponent) {
		int temp = 1; 
		for( int i = 0; i < exponent; i ++) {
			temp = temp * basis;
		}
		return temp;
	}
	
}
