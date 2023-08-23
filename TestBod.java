class Bod
{   private double x,y;
    public Bod(double x, double y)
    {   this.x=x;
        this.y=y;
    }
    public static void vzdXY(double x, double y)
    {   System.out.println(Math.sqrt(x*x+y*y));
    }
    public static void vzdXY(Bod b)
    {   System.out.println(Math.sqrt(b.x*b.x+b.y*b.y));
    } 
    public void vzd()
    {   System.out.println(Math.sqrt(x*x+y*y));
    } 
    public double getX()
    {   return x;
    }
}
public class TestBod
{   public static void main(String[] args)  //
    {   Bod.vzdXY(3,4);
        Bod b1 = new Bod(3,4);
        Bod.vzdXY(b1);
        b1.vzd();
        System.out.println(b1.getX());
    }
}