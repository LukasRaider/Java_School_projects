abstract class Zamestnanec extends Osoba
{   
    int plat;
    public Zamestnanec() {}  //N�hrada nyn� nep��stupn�ho implicitn�ho konstruktoru 
    public Zamestnanec(int v, int p)
    {   
        super(v); plat=p;
    }
    public void pisInfo()
    {  
        System.out.print("po�et osob: "+Osoba.getPocet()+", v�k:  "+vek);
        System.out.print(", plat: "+plat);        
    }    
}