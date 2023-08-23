//Zadejte poèet dnù a hodin. Program vypoète, kolik je to hodin
import java.io.*;
public class A1SoubTxt
{   public static void main(String [] args)
    {     //int hod,den,vysl;     //lokální promìnné se neinicializují, proto pøi selhání ètení je v promìnné nedefinovaná hodnota. kompilátor nepustí
          int hod,den, vysl=0;  
          
          try
          {   BufferedReader vstup = new BufferedReader(new FileReader("C:\\kurs\\vstup.txt"));  
              String ret=vstup.readLine();
              //hod = Integer.valueOf(ret).intValue(); //Pøevod z Integer na int je implicitní konverze, takže intValue() není nutné
              hod = Integer.valueOf(ret);             
              ret=vstup.readLine(); 
              //den = Integer.valueOf(ret).intValue();   
              den = Integer.valueOf(ret);              
              vysl=den*24+hod;              
              ret=""+vysl;  //automatická konverze na øetìzec
              BufferedWriter vystup = new BufferedWriter(new FileWriter("C:\\kurs\\vystup.txt"));
              vystup.write(ret); vystup.newLine();
              vstup.close(); vystup.close();
          }   catch(FileNotFoundException e) {System.out.println(e+"Soubor nenalezen");}    
              catch (NumberFormatException e){ System.out.println(e+" nelze pøevést na èíslo");}     
              catch (IOException e){System.out.println(e+"Soubor nelze èíst");}
          System.out.println("výsledek je "+vysl+" hodin."); 
    }     
}