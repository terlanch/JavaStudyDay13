package cn.tedu.interfaces;
/*
 *  �κ����͵Ķ���ֵ���ӿڣ�����ʱ������⣬����ʱ���
 *  ����ӿ�֮���Ƿ���ʵ�ֹ�ϵ
 *  �ӿ���ӿ�֮���̳У�����ӿڿ��Զ�ʵ���� ����
 *  �ӿ��������������Ժͷ�����  ���Զ������ԣ�Ĭ�ϱ�
 *  public&static&final��ͬ���Σ����󷽷���Ĭ�ϱ�
 *  public&abstract��ͬ���Σ�
 */
public class InterfaceDemo1 {
	
	public static void main(String[] args) {
		//��������
		B b = new C();
		//�������ͣ�ǿת��
		//�ڱ������涨������������������м̳й�ϵ ����ͨ��
		//�������ڹ涨���������ʵ�ʴ�����һ�¾�����ͨ��
		C c = (C)b; 
		//ClassCastException---����ת���쳣
		//����������������м̳й�ϵ ����ͨ��
		//���������ʵ�ʴ����಻һ�£����г���
		
		
		D d = (D)b;
		              
		//���������������û�м̳й�ϵ
		//D d = (D)c;
		
		//����û���⣬���г���
		//������֮���ǵ��̳�---��״ͼ�ṹ
		//���Կ���ȷ��������֮��Ĺ�ϵ
		//�ӿ���ӿ�֮����Ƕ�̳�---��״�ṹ
		//ȷ������֮��Ĺ�ϵ�ͺܸ���---����ʱ�ڲ���⣬����ʱ�ڲż��
		//�Ǽ������ӿ�֮����Ƿ���ʵ�ֹ�ϵ
		/*A a =(A) b;
		A a1 =(A) c;
		A a2 =(A) d;
		
		System.out.println("over");*/
		
		//System.out.println(A.i);
	}
	

}

interface A{
	//Ĭ�ϱ�public��static��final��ͬ����
	int i = 1;
	
	void m();
}
class B{}
class D extends B{}
class C extends B{}