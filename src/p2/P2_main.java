package p2;

public class P2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(rekursiv(32));
		}
		
		public static int rekursiv(int a) {
			if(a == 1) {
				return 0; 
			}
			return 1+rekursiv(a/2);
			}

}
