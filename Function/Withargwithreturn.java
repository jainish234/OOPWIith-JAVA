class W_arg
{
	int dis(int a,int b)
	{
		return a+b;
	}
}
class Withargwithreturn
{
	public static void main(String[] args)
	{
		W_arg w=new W_arg();
		int t=w.dis(10,5);
		System.out.println("Addition is:"+t);
	}
}