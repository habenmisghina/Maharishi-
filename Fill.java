package mumExamSolutions;

public class Fill {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 12, -2, -1 };
		int k = 3;
		int n = 10;
		int[] m= fill(a, k, n);
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}

	}

	public static int[] fill(int[] a, int k, int n) {
		int indexcounter=0;
		int[] b = new int[n];
		while (n > k) {
			for (int i = 0; i < k; i++) {
                b[indexcounter]=a[i];
               
                indexcounter++;
			}
	
			 n=n-k;
		}
		for(int i=0;i<k;i++){
			b[indexcounter]=a[i];
			
		}
return b;
	}
}