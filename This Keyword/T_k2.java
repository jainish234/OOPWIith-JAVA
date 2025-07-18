class Silk
{
	Silk()
	{
		System.out.println("Dairy Milk Chocolate");
	}
	Silk(int a)
	{
		this();
		System.out.println("Number is:"+a);
	}
}
class T_k2
{
	public static void main(String[] args)
	{
		Silk s=new Silk(10);
	}
}

output:
Dairy Milk Chocolate
Number is:10
