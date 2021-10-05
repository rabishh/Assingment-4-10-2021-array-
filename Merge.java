/*1.     Merge two sorted arrays
    array1 - 4,5,6,7,8
    array2 - 1,2,3,4
    o/p- 1,2,3,4,4,5,6,7,8*/
package Assingment;

public class Merge {
public static void main(String args[]) {
	int array1[]= {1,2,3,4};
	int array2[]= {4,5,6,7,8};
	int a=array1.length;
	int b=array2.length;
	int c=a+b;
	int array3[]=new int[c];
	for(int i=0;i<array1.length;i++) {
		array3[i]=array1[i];
	}
		for(int i=0;i<array2.length;i++) {
			array3[a+i]=array2[i];
		}
		for(int i=0;i<array3.length;i++) {
			System.out.print(array3[i]);
		}
	
}
}
