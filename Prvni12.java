abstract class Osoba
{   int vek;
    private static int pocet=0;
    public Osoba() {pocet++;}   
    public Osoba(int v) 
    {   vek=v; pocet++;
    }
    abstract public void pisInfo();  
    public String toString()                                            //
    {  return "toString poèet osob: "+Osoba.getPocet()+", vìk:  "+vek;  //
    }                                                                   //
    public static int getPocet()
    {   return pocet;
    }
}
abstract class Zamestnanec extends Osoba
{   int plat;
    public Zamestnanec() {} 
    public Zamestnanec(int v, int p)
    {   super(v); plat=p;
    }
    public void pisInfo()
    {  System.out.print("poèet osob: "+Osoba.getPocet()+", vìk:  "+vek);
       System.out.print(", plat: "+plat);        
    }    
}
class Student extends Osoba
{   int stipendium;
    public Student(int v, int s)
    {   super(v); stipendium=s;
    }
    public void pisInfo()
    {  System.out.print("poèet osob: "+Osoba.getPocet()+", vìk:  "+vek);        
       System.out.println(", stipendium: "+stipendium);
    }
    public String toString()                                //
    {  return super.toString()+", stipendium: "+stipendium; //
    }                                                       //
}
class Ekonomka extends Zamestnanec
{   public Ekonomka(int v, int p)
    {   super(v,p); 
    }
    public void pisInfo()
    {  super.pisInfo();  System.out.println();     
    }
}
class Ucitel extends Zamestnanec
{   int uvazek;
    public Ucitel(int v, int p, int u)
    {   super(v,p); uvazek=u;
    }
    public void pisInfo()
    {  super.pisInfo();        
       System.out.println(", poèet úvazkových hodin: "+uvazek);
    }
}
public class Prvni12
{    public static void main(String [] args)
    {   Student s1=new Student(20,1000);
        s1.pisInfo(); 
        System.out.println(s1);                             //
        Ekonomka e1 = new Ekonomka(30,12000);
        e1.pisInfo();        
        Ucitel u1=new Ucitel(40,20000,22);
        u1.pisInfo();
        System.out.print("poèet osob: "+Osoba.getPocet()+", vìk:  "+u1.vek);        
    }
}
