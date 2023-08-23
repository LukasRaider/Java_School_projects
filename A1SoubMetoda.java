//Zadejte poèet dnù a hodin. Program vypoète, kolik je to hodin (výsledek mùže být reálné èíslo)
import java.io.*;
public class A1SoubMetoda
{   public static int ctiSoubInt(BufferedReader br)
    {   try
        {   //BufferedReader vstup = new BufferedReader(new FileReader("C:\\kurs\\hello.java")); //kdyby byl pøíkaz zde, tak by se pokaždé èetlo od zaèátku 
            String ret=br.readLine(); 
            return Integer.valueOf(ret).intValue();
        }   catch(FileNotFoundException e) {System.out.println(e+"Soubor nenalezen");return 1;}    
            catch (NumberFormatException e){ System.out.println(e+" nelze pøevést na èíslo"); return 2;}     
            catch (IOException e){System.out.println(e+"Soubor nelze èíst");return 3;}
    }
    public static void pisSoubInt(int i, BufferedWriter bw)
    {   try
        {   String ret=""+i;  //automatická konverze na øetìzec
            bw.write(ret); bw.newLine();
        }   catch (IOException e){System.out.println(e+"Do souboru nelze zapsat");}
    }    
    public static void main(String [] args)
    {     //int hod,den,vysl;     //lokální promìnné se neinicializují, proto pøi selhání ètení je v promìnné nedefinovaná hodnota. kompilátor nepustí
          int hod=0,den=0,vysl=0; 
          
          try
          {   BufferedReader vstup = new BufferedReader(new FileReader("C:\\kurs\\hello.java")); 
              hod = ctiSoubInt(vstup);
              den = ctiSoubInt(vstup);        
              BufferedWriter vystup = new BufferedWriter(new FileWriter("C:\\kurs\\hello2.java"));
              vysl=(den*24)+hod;
              pisSoubInt(vysl,vystup);
              vstup.close(); vystup.close();
          }   catch(FileNotFoundException e) {System.out.println(e+"Soubor nenalezen");}    
              catch (NumberFormatException e){ System.out.println(e+" nelze pøevést na èíslo");}     
              catch (IOException e){System.out.println(e+"Soubor nelze èíst");}
          System.out.println("výsledek je "+vysl+" hodin."); 
    }     
}