package mypack;
/*
包 就好像 windows系统的  文件夹一样（同一个文件夹不能同名文件）。
定义包关键字： package
包名要 全部小写。
包里面（文件夹里面） 有类，类里面有方法。
*/
//import packa.DemoA;//导入了packa包中的DemoA类。
//import packa.DemoAA;
//import packa.DemoAAA;
/*
import packa.*;//导入了packa包中所有的类。不包括 packa中的包。 真正开发的时候不建议用*。
import packa.abc.*;

packa\DemoA.class 
packa\abc\DemoAbc.class

*/
//导包的原则：用到哪个类，就导入哪个类。

//import 干嘛用的啊？为了简化类名书写。
class  PackageDemo
{
	public static void main(String[] args) 
	{

		//packa.DemoA d = new packa.DemoA();
		DemoAbc d = new DemoA();
		d.show();

		packb.DemoB b = new packb.DemoB();
		b.method();//不能访问，不同包中，protented 权限方法
		System.out.println("Hello Package!");
	}
}


/*

PackageDemo.java:8: 找不到符号
符号： 类 DemoA
位置： 类 mypack.PackageDemo
                DemoA d = new DemoA();
                ^
PackageDemo.java:8: 找不到符号
符号： 类 DemoA
位置： 类 mypack.PackageDemo
                DemoA d = new DemoA();
                              ^
2 错误

原因：类名写错。

因为DemoA类已经有包的所属，所以必须要明确其包名。
记住：DemoA这个名词错的。 正确名称是报名.类名  packa.DemoA

================================================================


PackageDemo.java:8: 软件包 packa 不存在
                packa.DemoA d = new packa.DemoA();
                     ^
PackageDemo.java:8: 软件包 packa 不存在
                packa.DemoA d = new packa.DemoA();
                                         ^
2 错误


原因是在当前目录下没找到，因为packa存放在其他目录下，
应该配置一个classpath。


================================================================

PackageDemo.java:8: packa.DemoA 在 packa 中不是公共的；无法从外部软件包中对其进
行访问
                packa.DemoA d = new packa.DemoA();
                     ^
PackageDemo.java:8: packa.DemoA 在 packa 中不是公共的；无法从外部软件包中对其进
行访问
                packa.DemoA d = new packa.DemoA();
                                         ^
2 错误
原因是 类名 不是public
===============================================================



PackageDemo.java:9: show() 在 packa.DemoA 中不是公共的；无法从外部软件包中对其进
行访问
                d.show();
                 ^
1 错误

原因是 类中 方法 不是public的


总结：
包与包之间的类进行访问，被访问的包中的类必须是public的，被访问的包中的类的方法也必须是public的。

=======================================================================================


          public		protected		default		  private 权限由大到小 排列
同一类中    ok             ok              ok           ok
同一包中    ok             ok              ok           
子类中      ok             ok              
不同包中    ok


*/