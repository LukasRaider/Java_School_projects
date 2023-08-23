abstract class Zamestnanec extends Osoba
{   
    int plat;
    public Zamestnanec() {}  //Náhrada nyní nepøístupného implicitního konstruktoru 
    public Zamestnanec(int v, int p)
    {   
        super(v); plat=p;
    }
    public void pisInfo()
    {  
        System.out.print("poèet osob: "+Osoba.getPocet()+", vìk:  "+vek);
        System.out.print(", plat: "+plat);        
    }    
}