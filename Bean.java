package mumExamSolutions;

public class Bean {

	public static void main(String[] args) {
		int[]a={3, 4, 6, 7, 13, 15};
		int i= isBean(a);
		System.out.println(i);

	}
	public static int isBean(int[]a){
		int count9=0;
		int count13=0;
		int count7=0;
		int count16=0;
			
		for(int i=0;i<a.length;i++){
			if(a[i]==9){
				count9++;
			}
			else if(a[i]==13){
				count13++;
			}
			else if(a[i]==7){
				count7++;
			}
			else if(a[i]==16){
				count16++;
			}
		}
		
		if(count9>0 && count13==0 || count7>0&&count16>0){
			return 0;
		}
		return 1;
	}

}
