package cn.tedu.interfaces;
/*
 * 接口---模板、规范
 */
import java.util.Arrays;

public class InterfaceDemo3 {
	public static void main(String[] args) {
		//int[] arr = {2,5,7,3,4,1};
		//Lambda表达式
		Array a =(int[] arr)->{Arrays.sort(arr);};
		//方法体只有一句
		//Array a = (int[] arr)->Arrays.sort(arr);
		//可以类型推导
		//Array a = (arr)->Arrays.sort(arr);
		//只有一个参数的时候可以省略（）
		//Array a = arr->Arrays.sort(arr);
		//从前到后都只是一个参数的数据参与操作
		//::---的    静态方法
		//Array a = Arrays::sort;
		//排序
		int[] arr = {2,5,7,3,4,1};
		a.sortArray(arr);
		System.out.println(Arrays.toString(arr));
	}
}


//
interface Array{
	//排序
	void sortArray(int[] arr);
}