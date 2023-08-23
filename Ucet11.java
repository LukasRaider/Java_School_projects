import java.util.Scanner;
class MaloPenezException extends Exception
{    
    public MaloPenezException (String s) {super(s);}   //konstruktor s parametrem typu String volá nadøazenou výjimku     //
}
public class Ucet11 //pùvodnì ucet8
{   
    int stav;
    public void vloz(int castka) throws MaloPenezException
    {   
        if ((stav+castka)<0) throw new MaloPenezException("Na úètu není pro výbìr dostatek penìz"); //
        stav+=castka;
    }
    public void pisStav()
    {  
        System.out.println("Na úètu je: "+stav);
    }
    public void prevedNa(Ucet11 u, int c) throws MaloPenezException
    {   
        if ((stav-c)<0) throw new MaloPenezException("Na úètu není pro pøevod dostatek penìz");     //
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
            System.out.print("Zadej èástku pro vložení/výbìr penìz (celé èíslo)");
            castka = sc.nextInt();              
            try
            {   
                chyba=false;
                u1.vloz(castka);
            }   catch (MaloPenezException e)
                {System.out.println(e+" Zùstatek je "+u1.stav); chyba=true;} 
        } while (chyba==true); 
        System.out.println("Zùstatek je "+u1.stav);
    }    
}