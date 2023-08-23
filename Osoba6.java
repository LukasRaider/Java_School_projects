public class Osoba6 //pùvodnì Osoba5
{   
    String jmeno;
    Datum datNar;                           //
    Ucet6 ucty[] = new Ucet6[10];
    int pocetUctu=0;
    public Osoba6(String jmeno, Datum dn)   // 
    {   
        this.jmeno=jmeno;
        datNar=dn;                          //
    }
    public void pisUcty()
    {   
        for (int i=0; i<pocetUctu;i++)
        {   
            System.out.println(i+"-tý úèet: "+ucty[i]);
            //System.out.println(" se zùstatkem: "+ucty[i].stav); 
            ucty[i].pisStav();
        }
    }    
}