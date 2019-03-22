package cn.tedu.interfaces;
/*
 *  任何类型的对象传值给接口，编译时都不检测，运行时检测
 *  类与接口之间是否是实现关系
 *  接口与接口之间多继承，类与接口可以多实现吗？ 可以
 *  接口中允许定义属性和方法吗？  可以定义属性（默认被
 *  public&static&final共同修饰）抽象方法（默认被
 *  public&abstract共同修饰）
 */
public class InterfaceDemo1 {
	
	public static void main(String[] args) {
		//向上造型
		B b = new C();
		//向下造型（强转）
		//在编译器规定两个对象声明类如果有继承关系 编译通过
		//在运行期规定两个对象的实际创建类一致就运行通过
		C c = (C)b; 
		//ClassCastException---类型转换异常
		//两个对象的声明类有继承关系 便利通过
		//两个对象的实际创建类不一致，运行出错
		
		
		D d = (D)b;
		              
		//两个对象的声明类没有继承关系
		//D d = (D)c;
		
		//编译没问题，运行出错
		//类与类之间是单继承---树状图结构
		//可以快速确定两个类之间的关系
		//接口与接口之间的是多继承---网状结构
		//确定两者之间的关系就很复杂---编译时期不检测，运行时期才检测
		//是检测类与接口之间的是否有实现关系
		/*A a =(A) b;
		A a1 =(A) c;
		A a2 =(A) d;
		
		System.out.println("over");*/
		
		//System.out.println(A.i);
	}
	

}

interface A{
	//默认被public、static、final共同修饰
	int i = 1;
	
	void m();
}
class B{}
class D extends B{}
class C extends B{}
