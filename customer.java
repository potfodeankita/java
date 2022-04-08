class customer
{
int amount=200000;
synchronized void withdraw(int amount)
{
system.out.println("going to withdraw...........waiting for deposite");
if (this.amount<amount)
{
system.out.println("less balance")
try
{
wait();
}
catch(Exception e)
{
}
this.amount=this.amount-amount;
system.out.println("withdraw complete")
}
}
synchronized void deposite(int amount)
{
system.out.println("going to deposite");
this.amount=this.amount+amount;
system.out.println("deposite complete");
notify();
}
}
public class test
{
public static void main(string args[])
{
customer c=new customer();
new Thread()                                                                                         