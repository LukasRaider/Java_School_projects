class Ucitel extends Zamestnanec
{   
    int uvazek;
    public Ucitel(int v, int p, int u)
    {   
        super(v,p); uvazek=u;
    }
    public void pisInfo()
    {  
        super.pisInfo();        
        System.out.println(", po�et �vazkov�ch hodin: "+uvazek);
    }
}