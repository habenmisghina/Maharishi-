package mumExamSolutions;

public class OddValent {

	public static void main(String[] args) {
		int []a={2, 3, 4, 9, 1};
		int i=isOddValent(a);
		System.out.println(i);

	}
	public static int isOddValent(int []a){
		int oddcount=0;
		int occurances=0;
	
		for(int i=0;i<a.length;i++){
		 occurances=0;
			for(int j=0;j<a.length;j++){
				if(a[i]==a[j]){
					occurances++;
				}
				if(a[i]%2!=0){
					oddcount++;
				}
			}
			if(occurances>=2 && oddcount>0){
				return 1;
			}
			
		}
		return 0;
	}

}
