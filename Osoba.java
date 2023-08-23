abstract class Osoba
{   
    int vek;
    private static int pocet=0;
    public Osoba() {pocet++;}  //N�hrada nyn� nep��stupn�ho implicitn�ho konstruktoru 
    public Osoba(int v) 
    {   
        vek=v; pocet++;
    }
    abstract public void pisInfo();
    public void info()
    {  
        System.out.println("info: v�k:  "+vek);
    }    
    public String toString()
    {  
        return "toString po�et osob: "+Osoba.getPocet()+", v�k:  "+vek;
    }    
    public static int getPocet()
    {   
        return pocet;
    }
}