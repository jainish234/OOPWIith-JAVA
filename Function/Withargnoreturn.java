class Arg
{
	void sqr(int s)
	{
		System.out.println("Square is:"+(s*s));
	}
}
class Withargnoreturn
{
	public static void main(String[] args)
	{
		Arg a=new Arg();
		a.sqr(10);
	}
}