package cn.tedu.object;

public class Demo2 {
	public static void main(String[] args) {
		IC ic = new ICImpl();
		IBImpl ib = new IBImpl();
		ib.setIa(ic);
		ib.method();
	}

}
interface IC{
	void mc(IB ib);
}
interface IB{
	void mb();
}
class ICImpl implements IC{
	public void mc(IB ib){
		System.out.println("mc in ICImpl");
		ib.mb();
	}
}
class IBImpl implements IB{
	private IC ic;
	
	public void setIa(IC ic){
		this.ic = ic;
	}
	@Override
	public void mb() {
		// TODO Auto-generated method stub
		System.out.println("mb in IBImpl");
	}
	public void method(){
	
		ic.mc(this);
	}
}