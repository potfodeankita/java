class th1 extends Thread
{
public void run()
{
for(int i=0;i<=5;i++)
{
System.out.println("thread is"+(-1*i));
}
System.out.println("exit by thread1");
}
}
class th2 extends Thread
{
public void run()
{ 
for(int j=1;j<=5;j++)
{
System.out.println("thread is"+(2*j));
}
System.out.println("exit by thread2");
}
}
class th3 extends Thread
{
public void run()
{ 
for(int k=1;k<=5;k++)
{
System.out.println("thread is"+(2*k-1));
}
System.out.println("exit by thread3");
}
}
class multithread
{
public static void main(String args[])
{
th1 t1=new th1();
th2 t2=new th2();
th3 t3=new th3();
t1.start();
t2.start();
t3.start();
}
}

