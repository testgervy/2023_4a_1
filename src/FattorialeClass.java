/**
 * 
 * @author genitori
 *
 */
public class FattorialeClass {
	

	public FattorialeClass() {
		
	}

	public int fattoriale(int n) {
		int fatt; // il fattoriale di n
		int i; // per iterare tra 1 e n

		fatt = 1;
		for (i = 1; i < n; i++) // corretto <=
		{
			fatt = fatt * i;
		}
		return fatt;
	}

	public static void main(String[] args) {

		FattorialeClass f = new FattorialeClass();
		System.out.println("fattoriale " + f.fattoriale(5));

	}

}
