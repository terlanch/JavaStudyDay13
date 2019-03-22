package cn.tedu.object;

public class Demo1 {
	public static void main(String[] args) {
		ID id = new MC();
		id.m1();
		System.out.println(ID.a);
	}
}

interface ID{
	void m1();
	int a = 100;
}
class MC implements ID{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
}