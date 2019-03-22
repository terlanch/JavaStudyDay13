package cn.tedu.nestedClasses;
/*
 * 接口内部类
 * 		都是静态内部类
 * 
 * 内部接口---都需要是静态
 */
public class InnerDemo4 {
	static interface Inner5s{}
}

interface Outer5{
	//静态内部类
	static class Inner5{}
	static interface Inner5s{}
}