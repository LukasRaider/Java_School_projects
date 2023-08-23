public class Prvni13
{    
    public static void main(String [] args)
    {   
        Student s1=new Student(20,1000);
        s1.pisInfo(); 
        System.out.println(s1);        
        Ekonomka e1 = new Ekonomka(30,12000);
        e1.pisInfo();        
        Ucitel u1=new Ucitel(40,20000,22);
        u1.pisInfo();
        System.out.println("poèet osob: "+Osoba.getPocet()+", vìk:  "+u1.vek);        
    }
}
