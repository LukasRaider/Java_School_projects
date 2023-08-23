class Vozidlo
{   public int rychlost, komunikace;    //typ komunikace 1:obec, 2: mimo m�sto, 3: d�lnice

    public Vozidlo(int rychlost, int komunikace)
    {   this.rychlost=rychlost;
        this.komunikace=komunikace;
    }
    public void pisInfo()
    {   int r=rychlost; int k=komunikace; //aby n�sleduj�c� v�raz byl krat��
        if ((r>50 && k==1) || (r>90 && k==2) || (r>130)) 
            System.out.print("pokuta, proto�e ");
        System.out.print(" m� rychlost: "+rychlost);

    }
}
class Auto extends Vozidlo
{   public Auto(int rychlost, int komunikace){super(rychlost,komunikace); }
}
class Motorka extends Vozidlo
{   public Motorka(int rychlost, int komunikace){super(rychlost,komunikace); }
}
class Traktor extends Vozidlo
{   public Traktor(int rychlost, int komunikace){super(rychlost,komunikace); }
    public void pisInfo()
    {   if (rychlost>50) System.out.println("pokuta, proto�e traktor m� rychlost: "+rychlost);
        if (komunikace==3) System.out.println("pokuta, proto�e traktor nesm� na d�lnici");
    }    
}
public class testVozidlo
{   public static void main(String [] args)
    {   Auto a1=new Auto(45,1);       a1.pisInfo();
        Motorka m1=new Motorka(90,1); m1.pisInfo();
        Traktor t1=new Traktor(60,2); t1.pisInfo();
        Traktor t2=new Traktor(40,3); t2.pisInfo();
    }
}
