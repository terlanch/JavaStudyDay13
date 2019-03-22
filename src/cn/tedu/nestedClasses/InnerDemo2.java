package cn.tedu.nestedClasses;
/*
 * 静态内部类
 * 
 * 
 * 		A.B.i---A可能是对象，B可能是属性，i可能是B的属性
 * 				A可能是类，B可能是静态属性，i可能是B的属性
 * 				A可能是外部类，B可能是静态内部类，i可能是B的静态属性
 */


public class InnerDemo2 {
	public static void main(String[] args) {
		//创建静态内部类对象
		Outer3.Inner3 in = new Outer3.Inner3();
		in.n();
		Outer3 o3 = new Outer3();
		System.out.println(o3.a.i);	
		System.out.println(Outer3.a.i);
	}

}

//外部类
class Outer3{
	
	//属性
	static A a = new A();
	static int j = 1;
	
	//静态内部类
	//可以定义所有的属性和方法 以及静态常量
	//可以被访问权限修饰符修饰以及final、abstract修饰
	//可以继承和实现
	//只能拿到外部类的所有静态属性和方法
	static class Inner3 extends InnerDemo2 implements Cloneable{
		static int i = 1;
		public void n(){
			System.out.println(j);
		}
	}
	
	
	//方法
	public void m(){}
}

class A{
	int i;
}
