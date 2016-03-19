class ArrayDemo2 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[3];//【编译不报错，是因为，没有加载到堆内存中（初始化）。如果，加载，那一旦编译就占完内存了】
//		System.out.println(arr[3]);//ArrayIndexOutOfBoundsException:
		//当访问到数组中不存在的角标时，就会发生该异常。

//		arr = null;
//		System.out.println(arr[0]);//NullPointerException
//		当引用型变量没有任何实体指向时，还在用其操作实体。就会发生该异常。 

//		System.out.println(arr);//  [I@c17164  java  调用 windows 哈希算法，算出arr 在内存中的存储位置，最终的内存中开辟空间的是windows。
                                           //@ 为分界线，左边“[I” 代表，实体的类型。 “[”表示 数组型实体。 “I” 表示int 类型   
		
	}
}
