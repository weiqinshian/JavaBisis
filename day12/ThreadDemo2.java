
/*
���߳�����ִ�д��롿
�������̵߳�Ŀ����Ϊ�˿���һ��ִ��·��������ִ��·����Ŀ�� ����һ���ִ������������ͬʱ���С�
��δ���һ���߳��أ�

�����̷߳�ʽһ���̳�Thread�ࡣ

���裺
1������һ����̳�Thread�ࡣ
2������Thread���е�run������
3��ֱ�Ӵ���Thread��������󴴽��̡߳�
4������start���������̲߳������̵߳�����run����ִ�С�
����ͨ��Thread��getName��ȡ�̵߳����� Thread-���(��0��ʼ)�����÷�ʽThread.currentThread().getName()

���̵߳����־���main��
*/

class Demo extends Thread
{
	private String name;
	Demo(String name)
	{
		super(name);
		//this.name = name;
	}
	public void run()
	{
		for(int x=0; x<10; x++)
		{
			//for(int y=-9999999; y<999999999; y++){}
			System.out.println(name+"....x="+x+".....name="+Thread.currentThread().getName());//�� currentThread  ���ضԵ�ǰ����ִ�е��̶߳�������á���
		}
	}
}
class ThreadDemo2 
{
	public static void main(String[] args) 
	{

		/*
		�����̵߳�Ŀ����Ϊ�˿���һ��ִ��·����ȥ����ָ���Ĵ������������ʵ��ͬʱ���С�		
		�����е�ָ������������ִ��·��������
		jvm���������̵߳����񶼶��������������С�
		���Զ�����߳������������Ķ��أ�
		Thread�����������̣߳��߳�����Ҫ����ġ��߳�������ʱ�����ã�������һ�δ��롿������Thread��Ҳ�������������
		��������ͨ��Thread���е�run���������֡�Ҳ����˵��run�������Ƿ�װ�Զ����߳���������ĺ�����		
		run�����ж�������߳�Ҫ���е�������롣
		�����߳���Ϊ������ָ�����룬����ֻ�м̳�Thread�࣬����дrun������
		�����еĴ��붨����run�����м��ɡ� 
		*/
//
//		Thread t1 = new Thread();

		Demo d1 = new Demo("����");//���̴߳������͵��ã����ࣩ��Thread Ĭ�Ϲ��캯���������������鿴Դ�롿
		Demo d2 = new Demo("xiaoqiang");
		d1.start();//�����̣߳�����run��������start���� ʹ���߳̿�ʼִ�У�Java ��������ø��̵߳� run ��������
		
		d2.start();
		System.out.println("over...."+Thread.currentThread().getName());
	}
}
//����run�͵���start��ʲô����
