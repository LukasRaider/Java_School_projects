abstract class Osoba
{   
    int vek;
    private static int pocet=0;
    public Osoba() {pocet++;}  //Náhrada nyní nepøístupného implicitního konstruktoru 
    public Osoba(int v) 
    {   
        vek=v; pocet++;
    }
    abstract public void pisInfo();
    public void info()
    {  
        System.out.println("info: vìk:  "+vek);
    }    
    public String toString()
    {  
        return "toString poèet osob: "+Osoba.getPocet()+", vìk:  "+vek;
    }    
    public static int getPocet()
    {   
        return pocet;
    }
}