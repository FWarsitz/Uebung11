package p3;

public class P3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(kapital(500,5));
	}

	public static int kapital(int a, int jahre) {
		if(jahre == 0) {
			return a; 
		}
		
		return (int) Math.floor(1.05 * kapital(a, jahre -1));
	}
	
}
