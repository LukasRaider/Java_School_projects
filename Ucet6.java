public class Ucet6  //pùvodnì Ucet5
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
    public void pisStav()       //na dalším øádku je zmìna
    {  
        System.out.println("Majitel úètu: "+majitel.jmeno+" je starı "+(2008-majitel.datNar.rok)+" let, na úètu je: "+stav);
    }
    public String toString()
    {  
        return "Majitel úètu: "+majitel.jmeno+", na úètu je: "+stav;
    }    
    public void prevedNa(Ucet6 u, int c)
    {   
        u.stav+=c;
        stav-=c;
    }    
}