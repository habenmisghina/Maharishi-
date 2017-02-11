package mumExamSolutions;

public class ISLAYERED {

	public static void main(String[] args) {
	int[]a={1, 1, 2, 2, 2,3, 3,9,9};
	int i=islayered(a);
	System.out.println(i);

	}
public static int islayered(int[]a){
	int count=0;
	for(int i=0;i<a.length;i++){
		count=0;
		for(int j=0;j<a.length;j++){
			if(a[i]==a[j]){
				count++;
			}
			if(i<a.length-1){
				if(a[i]>a[i+1]){
					return 0;
				}
			}
		}
		if(count<=1){
			return 0;
		}
	}
	return 1;
}
}
