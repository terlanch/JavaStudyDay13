package cn.tedu.interfaces;
/*
 * interface(接口)
 * 
 * 		如果抽象类中所有的方法都是抽象方法，就把抽象类变成接口
 * 		用interface来表示。类与接口之间通过implement来表示实
 * 		现，如果一个普通类实现接口就要把接口中所有的抽象方法进
 * 		行重写，如果不想都重写就要把普通类变成抽象类。接口与接
 * 		口之间允许多继承
 * 			接口中都是抽象方法？不一定 如果是jdk1.8以前 接口中
 * 		只能有抽象方法。jdk1.8开始就允许接口中可以去定义实体方
 * 		法（static 或者 默认）
 * 			接口能定以构造方法吗？不能，就无法创建对象
 */


public class InterfaceDemo {

}
//图形类
//接口 ---interface---接口不是类
//接口允许多继承
interface Shape extends Cloneable{
	
	//没有构造方法
	//public Shape(){}
	//周长和面积
	//抽象方法
	public double getArea();
	//抽象方法
	public double getGirth();
	
	
}
//让类和接口之间产生这种关联关系是通过implements---实现
//如果普通类实现了接口就要重写所有的抽象方法、
//如果不想都重写就把普通类变成抽象类
class Rectangle implements Shape,Cloneable{

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getGirth() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
