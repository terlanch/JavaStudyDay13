package cn.tedu.nestedClasses;

public class InnerDemo3 {
	
	Inner4 in4 = new Inner4() {
		
		@Override
		void n() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		void m() {
			// TODO Auto-generated method stub
			
		}
	};
	public static void main(String[] args) {
		//匿名内部类---{}
		//匿名内部类在进行方法的重写
		//（final修饰的类不能被继承）能被继承的类或者能被实现的接口都可以具有匿名内部类的形式
		//如果匿名内部类在方法中定义就和方法内部类使用一致，如果在成员位置就和成员内部类使用方法一致
		//匿名内部类创建的对象in
		
		Inner4 in = new Inner4() {
			
			int i = 1;
			
			@Override
			void n() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			void m() {
				// TODO Auto-generated method stub
				System.out.println(1);
			}
		};
		in.m();
		
		//普通类也具有匿名内部类
		Inner5 in5 = new Inner5(){};
		//接口也有匿名内部类
		Inner6 in6 = new Inner6() {
		};
	}
	
}

interface Inner6{}

class Inner5{}

//
abstract class Inner4{
	abstract void m();
	abstract void n();
}
