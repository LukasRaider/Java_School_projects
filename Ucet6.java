public class Ucet6  //p�vodn� Ucet5
{   
    int stav;
    Osoba6 majitel;
    public Ucet6(Osoba6 o, int c)
    {   
        majitel=o; stav=c;
        o.ucty[o.pocetUctu]=this;
        o.pocetUctu++;
    }
    public void vloz(int c)
    {   
        stav+=c;
    }
    public void pisStav()       //na dal��m ��dku je zm�na
    {  
        System.out.println("Majitel ��tu: "+majitel.jmeno+" je star� "+(2008-majitel.datNar.rok)+" let, na ��tu je: "+stav);
    }
    public String toString()
    {  
        return "Majitel ��tu: "+majitel.jmeno+", na ��tu je: "+stav;
    }    
    public void prevedNa(Ucet6 u, int c)
    {   
        u.stav+=c;
        stav-=c;
    }    
}