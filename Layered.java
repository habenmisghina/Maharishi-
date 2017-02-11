package mumExamSolutions;

public class Layered {

	public static void main(String[] args) {
		int []a={2,2,3,3,4,4,4,4,};
		int i=isLayered(a);
		System.out.println(i);
		

	}
	public static int isLayered(int[]a){
		int count=0;
		for(int i=0;i<a.length-1;i++){
			if(a[i]>a[i+1]){
				return 0;
				
			}
		}
		for(int i=0;i<a.length;i++){
			count=0;
			for(int j=0;j<a.length;j++){
				if(a[i]==a[j]){
					count++;
				}
				
			}
			if(count<2){
				return 0;
			}
		}
		return 1;
	}

}
