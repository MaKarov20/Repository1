package dataTypes;

import java.lang.reflect.Array;

import javax.swing.JScrollBar;

public class whileeee {

	public static void main(String[] args) {
int i=0;
while (i<5) {
	//System.out.println(i);
	i++;}

String stairs = "";
int a = 0;
while (a<5) {
	stairs+="*";
	//System.out.println(stairs);
			a++;}

int[][] arr = {{ 1,2,3 },{4,5,6},{7,8,9}};

//for (int[] js : arr) {
//	for (int j : js) {
//		System.out.print(j);}}


for (int j = 0; j < arr.length; j++) {
	int[] ks = arr[j];
	for (int k = 0; k < ks.length; k++) {
	//	System.out.print(ks[k]);
	}
	
}


for (int j = 0; j < arr.length; j++) {
	for (int j2 = 0; j2 < arr.length; j2++) {
		System.out.print(arr[j][j2]+ " ");
		
	}
	
}

	}

}
