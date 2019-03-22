package cn.tedu.nestedClasses;

public class InnerDemo1 {
	
	public static void main(String[] args) {
		//创建成员内部类的对象
		Outer2.Inner2 in = new Outer2().new Inner2(); 
		
	}

}

//外部类
class Outer2{
	//属性
	static int i = 10;
	
	//成员内部类
	//可以定义非静态的属性和方法以及静态常量
	//可以被访问权限修饰符以及final和abstract修饰
	//可以继承和实现
	//可以拿到外部类所有的属性和方法
	class Inner2 extends InnerDemo1 implements Cloneable{
		static final int j = 10;
		public void n(){
			System.out.println(i);
			m();
		}
	}
	
	
	//方法
	public void m(){}
}