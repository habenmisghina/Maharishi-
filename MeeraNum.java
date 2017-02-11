package mumExamSolutions;

public class MeeraNum {

	public static void main(String[] args) {
		int n=30;
		int i=isMeera(n);
		System.out.println(i);
	}
public static int isMeera(int n){
	int factorCount=0;
	for(int i=2;i<n;i++){
		if(n%i==0){
			factorCount++;
		}
	}
	if(n%factorCount==0){
		return 1;
	}
	return 0;
}
}
