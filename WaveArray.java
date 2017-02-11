package mumExamSolutions;

public class WaveArray {

	public static void main(String[] args) {
		int []a={7,2,4,5,10,9};
		int i=isWave(a);
		System.out.println(i);

	}
	public  static int isWave(int []a){
		for(int i=0;i<a.length-1;i++){
			if(a[i]%2!=0 && a[i+1]%2!=0 || a[i]%2==0 &&a[i+1]%2==0){
				return 0;
			}
		}
		return 1;
	}

}
