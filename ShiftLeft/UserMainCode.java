package ShiftLeft;

public class UserMainCode {
	public static int[] shiftLeft(int[] arr){
		int[] n=new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=5){
				n[k]=arr[i];
				k++;
			}
		}int size=arr.length-n.length;
		if(n.length<size){
			for(int i=n.length;i<arr.length;i++){
				n[i]=0;
			}
		}
		return n;
	}

}
