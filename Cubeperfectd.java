package mumExamSolutions;

public class Cubeperfectd {

	public static void main(String[] args) {
		int[]a={0,-1,1};
		int i=isPerfectcube(a);
		System.out.println(i);

	}
public static int isPerfectcube(int[]a){
	int minvalue=-100;
	int maxvalue=100;
	int countcube=0;
	for(int i=0;i<a.length;i++){
		countcube=0;
		for(int j=minvalue;j<maxvalue;j++){
			if(a[i]==j*j*j){
				countcube++;
				break;
			}
		}
		if(countcube==0){
			return 0;
		}
	}
	return 1;
}
}
