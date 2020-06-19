package dataTypes;

import java.util.ArrayList;
import java.util.Arrays;

public class arr {

	public static void main(String[] args) {

int ll [] = {23,43,22,56,78,543,23};

System.out.println(Arrays.toString(ll));

ArrayList arrList = new ArrayList(Arrays.asList("solak",23,34.545,"saglak",true));

arrList.remove(0);
System.out.println(arrList);
System.out.println(arrList.size());
arrList.add(false);
System.out.println(arrList);

int [] nums = {1,2,3,4,5,6,7,8};

//for (int i : nums) {
//	if (i%2==0) {
//		System.out.println(i+" even");
//		
//	}else {
//		System.out.println(i+" odd");
//	}}

for (int i = 0; i < nums.length; i++) {
	if (nums[i]%2==0) {
		System.out.println(nums[i]+ " even");
	}else {
		System.out.println(nums[i]+" odd");
	}
	
}

	}

}
