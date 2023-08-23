interface VydavaZvuk
{   
    public String zvuk();
}
abstract class Zvire
{   
    String jmeno;
    public Zvire(String jmeno) {this.jmeno=jmeno;}
}
class Pes extends Zvire implements VydavaZvuk
{   
    Boolean sRodokmenem;
    public Pes(String jmeno) {super(jmeno);}
    public String zvuk() {return "haf";}
}  
class Kocka extends Zvire implements VydavaZvuk
{   
    Boolean sRodokmenem;
    public Kocka(String jmeno) {super(jmeno);}
    public String zvuk() {return "mòau";}
}
class Zelva extends Zvire
{   
    int rychlost;
    public Zelva(String jmeno) {super(jmeno);}
} 
class Auto implements VydavaZvuk                    //
{   
    String jmeno;                                   //
    int rychlost;                                   //
    public Auto(String jmeno) {this.jmeno=jmeno;}   //
    public String zvuk() {return "tu-tù";}          //
} 
public class testPoly6
{   
    public static void main(String [] args)
    {   
        VydavaZvuk zv[] = new VydavaZvuk[10];
        zv[0]=new Pes("Azor"); zv[1]=new Pes("Rex"); 
        zv[2]=new Kocka("Mici"); zv[3]=new Kocka("Mourek"); 
        zv[4]=new Auto("Mercedes");                 //
        for (int i=0;i<=4;i++) 
        {   
            System.out.print(zv[i].getClass().getName()+" se jmenuje ");
            Zvire z=(Zvire)zv[i];       //zde to u auta havaruje
            System.out.print((z.jmeno));   
            System.out.println(" a vydává zvuk "+zv[i].zvuk());
        }
    }
}
