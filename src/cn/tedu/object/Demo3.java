package cn.tedu.object;

public class Demo3 {
	public static void main(String[] args) {
		MyClass.method(new A(){
			@Override
			public void ma() {
				// TODO Auto-generated method stub
				System.out.println("ma in anonymous inner class");
			}
		});
		class MyMaClass implements A{

			@Override
			public void ma() {
				// TODO Auto-generated method stub
				System.out.println("ma in local inner class");
			}
			
		}
		MyClass.method(new MyMaClass());
	}

}
interface A{
	void ma();
}
class MyClass {
	public static void method(A a){
		System.out.println("in method");
		a.ma();
	}
	
}
