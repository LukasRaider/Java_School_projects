class Student extends Osoba
{   
    int stipendium;
    public Student(int v, int s)
    {   
        super(v); stipendium=s;
    }
    public void pisInfo()
    {  
        System.out.print("po�et osob: "+Osoba.getPocet()+", v�k:  "+vek);        
        System.out.println(", stipendium: "+stipendium);
        info();
    }
    public String toString()
    {   
        return super.toString()+", stipendium: "+stipendium;
    }    
}