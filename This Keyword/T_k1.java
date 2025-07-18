class Main
{
	int a;
	Main(int a)
	{
		this.a=a;
	}
	void dis()
	{
		System.out.println("Number is"+a);
	}
}
class T_k1
{
	public static void main(String[] args) 
	{
		Main m=new Main(10);
		m.dis();
	}
}


output:
Number is10