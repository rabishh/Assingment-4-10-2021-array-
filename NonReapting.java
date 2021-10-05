package Assingment;

public class NonReapting {
	public static void main(String args[]) {
		int i,j;
		int flag=0;
		int arr[]= {20,20,10,30,10,30,8};
		for( i=0;i<=arr.length-1;i++) {
			for(j=0;j<=arr.length-1;j++) {
				if(i==j) {
					continue;
				}
				if(arr[i]==arr[j]) {
					flag=flag+1;
					break;
				}
				else if(j==arr.length-1) {
					System.out.println(" found element is:"+arr[i]);
				}
				
			}
		}
	
	}

}
 