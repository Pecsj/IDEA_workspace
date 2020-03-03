package array;

import java.util.Arrays;

public class ArrayTools {

	public static void main(String[] args) {
		int[] a=new int[] {1,2,3,4};
		int[] b;
		b=new int[] {8,4,6,9,2,7,10,2,5};
		//查找元素在数组中的索引(升序排序)
		System.out.println(Arrays.binarySearch(a,4));
		//将所有元素统一赋值
		Arrays.fill(a,1);
		for(int i:a) {
			System.out.println(i);
		}
		//排序
		Arrays.sort(b);
		for(int i:b) {
			System.out.println(i);
		}
	}

}
