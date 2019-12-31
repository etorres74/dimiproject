package livrojava;

public class IfDemo {
	
	public static void main (String args[]) {
	
	int a,b,c;
	
	a = 2;
	b = 3;
	
	if (a<b) {
		
		System.out.println("a é menor que b");
		
	if (a==b) 
			
	     System.out.println("isto voce não verá.. seu zé ruela");
	     System.out.println();
	     
	     c = a-b; // c contem -1
	     
	     System.out.println("c contem -1");
	     
	     if (c>=0) System.out.println("c não é negativo");
	     if (c<0) System.out.println("c é negativo");
	     
	     System.out.println();

	     c = b-a; // agora c contem 1
	     
	     System.out.println("c contem 1");
	     if (c >=0) System.out.println("c não é negativo");
	     if (c <0) System.out.println("c é negativo");
	     
	     
	     	     
	
	
	
	}


}
}