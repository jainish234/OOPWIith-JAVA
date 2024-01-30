class R_arg
{
	int cube()
	{
		return 5*5*5;
	}
}
class Noargwithreturn
{
	public static void main(String[] args)
	{
		R_arg r=new R_arg();
		r.cube();
		int c=r.cube();
		System.out.println("Cube is"+c);
	}
}