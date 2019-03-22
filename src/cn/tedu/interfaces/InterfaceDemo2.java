package cn.tedu.interfaces;
/*
 * JDK1.8在接口中的新特性
 * 	允许定义实体方法，通过static和default来修饰完成的
 * 
 * 	Lambda表达式---用于重写（接口）抽象方法，规定接口
 * 				中只能有一个抽象方法，这个接口就叫做
 * 				函数式接口---函数式编程
 */
public class InterfaceDemo2 {
	public static void main(String[] args) {
		//Lambda表达式
		//(参数列表)->{重写的方法体}
		//Calc c = (int x,int y)->{return x>y?x:y;};
		//如果方法体只有一句话就可以省略{}以及return
		//Calc c = (int x,int y)->x>y?x:y;
		//由前面抽象方法的参数类型可以推导出后面需要的类型
		//Lambda表达式使用的前提接口有且只有一个抽象方法
		Calc c = (x,y)->x>y?x:y;
		System.out.println(c.getMax(6, 8));
	}
}

//计算器 Calc
//函数式接口----只有一个抽象方法---函数式编程
@FunctionalInterface
interface Calc{
	//求和
	//实体方法---默认方法
	public default int getSum(int n,int m){
		return m+n;
	}
	
	//求乘
	//实体方法---静态方法
	public static int getCheng(int n,int m){
		return m*n;
	}
	
	//抽象方法
	int getMax(int n,int m);
}
