class Trojuhelnik
{
	int a, b, c; 
	
	public Trojuhelnik(int aa, int bb, int cc)
	{
		a = aa;
		b = bb;
		c = cc;
	}
	public Trojuhelnik(int aa, int bb)
	{
	    this(aa, bb, bb);
	}
	public Trojuhelnik(int aa)
	{
	    this(aa, aa, aa);
	}
	public boolean existuje()
	{
		if (a + b > c && a + c > b && b + c > a)
			return true;
		else
			return false;
	}
	public int obvod()
	{
		if (this.existuje())
			return a + b + c;
		else
			return -1;
	}
	public static void main(String [] args)
	{
		Trojuhelnik t1, t2, t3, t4, t5;
		t1 = new Trojuhelnik(10,1,1); t2 = new Trojuhelnik(3,4,5);
		t3 = new Trojuhelnik(3,4); t4 = new Trojuhelnik(3);
		t5 = new PravouhlyTrojuhelnik(3,4);
		if (t1.existuje()) System.out.println("t1 exist"); else System.out.println("t1 ne exist");
		if (t2.existuje()) System.out.println("t2 exist"); else System.out.println("t2 ne exist");
		System.out.println("t3 má obvod: " + t3.obvod());  //11
		System.out.println("t4 má obvod: " + t4.obvod());  //9
		System.out.println("t5 má obvod: " + t5.obvod());  //12
	}
}

class PravouhlyTrojuhelnik extends Trojuhelnik
{
	public PravouhlyTrojuhelnik(int aa, int bb)
	{
		super(aa, bb, (int) Math.sqrt(aa * aa + bb * bb));
	}
}
