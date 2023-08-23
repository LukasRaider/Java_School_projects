import java.util.Scanner;
class MaloPenezException extends Exception
{    
    public MaloPenezException (String s) {super(s);}   //konstruktor s parametrem typu String vol� nad�azenou v�jimku     //
}
public class Ucet11 //p�vodn� ucet8
{   
    int stav;
    public void vloz(int castka) throws MaloPenezException
    {   
        if ((stav+castka)<0) throw new MaloPenezException("Na ��tu nen� pro v�b�r dostatek pen�z"); //
        stav+=castka;
    }
    public void pisStav()
    {  
        System.out.println("Na ��tu je: "+stav);
    }
    public void prevedNa(Ucet11 u, int c) throws MaloPenezException
    {   
        if ((stav-c)<0) throw new MaloPenezException("Na ��tu nen� pro p�evod dostatek pen�z");     //
        u.stav+=c; 
        stav-=c;
    }   
    public static void main(String[] args)
    {   
        boolean chyba;                                  
        int castka=0;
        Ucet11 u1 = new Ucet11();
        do
        {   
            Scanner sc = new Scanner(System.in);
            System.out.print("Zadej ��stku pro vlo�en�/v�b�r pen�z (cel� ��slo)");
            castka = sc.nextInt();              
            try
            {   
                chyba=false;
                u1.vloz(castka);
            }   catch (MaloPenezException e)
                {System.out.println(e+" Z�statek je "+u1.stav); chyba=true;} 
        } while (chyba==true); 
        System.out.println("Z�statek je "+u1.stav);
    }    
}