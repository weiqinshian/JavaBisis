package cn.itcast.p4.generic.define.demo;

/*
public class Tool {

	private Object object;

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
}
*/
//在jdk1.5后，使用泛型来接收类中要操作的引用数据类型。
//泛型类。什么时候用？当类中的操作的引用数据类型不确定的时候，就使用泛型来表示。 


public class Tool<QQ>{
	private QQ q;

	public QQ getObject() {
		return q;
	}

	public void setObject(QQ object) {
		this.q = object;
	}
	
	
	/**
	 * 将泛型定义在方法上。
	 * @param str
	 */
	public <W> void show(W str){
		System.out.println("show : "+str.toString());
	}
	public void print(QQ str){
		System.out.println("print : "+str);
		//System.out.println("print : "+str.length());【一旦使用泛型，就不能使用 string 类特有的方法。万一传进来的是 其他类型如 person】
	}
	
	/**
	 * 当方法静态时，不能访问类上定义的泛型。如果静态方法使用泛型，
	 * 只能将泛型定义在方法上。  【 因为，类型要根据 类的对象 确定
	 * 
	 * 泛型定义在  返回类型之前， 关键字之后
	 * @param obj
	 */
	public static <Y> void method(Y obj){
		System.out.println("method:"+obj);
	}

}
