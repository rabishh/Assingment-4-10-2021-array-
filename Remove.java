/*2.    Array- 1,2,4,5,7    k = 5
    O/P- 1,2,4,7
    Remove an element from an array*/

package Assingment;
import java.util.*;
public class Remove {
public static void main(String args[]) {
	int a[]= {1,2,4,5,7};
	System.out.println("original array:=>"+Arrays.toString(a));
	int index=5;
	int c[]=new int[a.length-1];
	for(int i=0,k=0;i<a.length;i++) {
		if(a[i]==index) {
			continue;
		}
		c[k++]=a[i];
	}
	System.out.println("new array:=>"+Arrays.toString(c));
}  
}
