public class Bod
{   
    double x,y;
    public Bod(double x, double y)
    {   
        this.x=x;
        this.y=y;
    }
    public static void vzdXY(double x, double y)
    {   
        System.out.println(Math.sqrt(x*x+y*y));
    }
    public static void vzdXY(Bod b)
    {   
        System.out.println(Math.sqrt(b.x*b.x+b.y*b.y));
    } 
    public void vzd()
    {   
        System.out.println(Math.sqrt(x*x+y*y));
    } 
}
