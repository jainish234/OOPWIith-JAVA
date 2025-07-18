class One{
	void msg()
	{
		System.out.println(this);
	}
}
class T_k
{
	public static void main(String[] args) 
	{
		One o=new One();
		System.out.println(o);
		o.msg();
	}
}