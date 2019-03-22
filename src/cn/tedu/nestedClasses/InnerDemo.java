package cn.tedu.nestedClasses;
/*
 * 内部类
 * 		类内部有类
 * 			方法（局部）内部类--->看下面	
 * 			成员内部类----InnerDemo1
 * 			静态内部类----InnerDemo2
 * 			匿名内部类----InnerDemo3
 * 
 * 		接口内部有类 
 */
public class InnerDemo {
	
	public static void main(String[] args) {
		//外部类的对象
		Outer1 out1 = new Outer1();
		out1.m();
	}

}

//外部类
class Outer1{
	
	//属性
	static int j = 1;
	
	//方法
	public void m(){
		int k = 1;//在JDK1.8以前需要手动添加final---显示常量
				  //在JDK1.8及其以后不需要手动添加，底层默认添加---隐式常量
		//被方法内部类
		//可以定义非静态的属性和方法
		//可以定义静态常量
		//可以被final 或者abstract修饰这个类
		//不能访问权限修饰符修饰
		//可以进行继承和实现
		//可以拿到外部类的所有属性和方法
		//只能拿到本方法中的常量---final修饰
		 class Inner1 extends InnerDemo implements Cloneable{
			final static int i = 10;
			int l =10;
			public void mn(){
				System.out.println(j);
				System.out.println(k);
				n();
			}	
		}
		
		//创建方法内部类的对象
		Inner1 in = new Inner1();
		in.mn();
	}
	
	public void n(){
		
	}
}
