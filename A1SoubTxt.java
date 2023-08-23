//Zadejte po�et dn� a hodin. Program vypo�te, kolik je to hodin
import java.io.*;
public class A1SoubTxt
{   public static void main(String [] args)
    {     //int hod,den,vysl;     //lok�ln� prom�nn� se neinicializuj�, proto p�i selh�n� �ten� je v prom�nn� nedefinovan� hodnota. kompil�tor nepust�
          int hod,den, vysl=0;  
          
          try
          {   BufferedReader vstup = new BufferedReader(new FileReader("C:\\kurs\\vstup.txt"));  
              String ret=vstup.readLine();
              //hod = Integer.valueOf(ret).intValue(); //P�evod z Integer na int je implicitn� konverze, tak�e intValue() nen� nutn�
              hod = Integer.valueOf(ret);             
              ret=vstup.readLine(); 
              //den = Integer.valueOf(ret).intValue();   
              den = Integer.valueOf(ret);              
              vysl=den*24+hod;              
              ret=""+vysl;  //automatick� konverze na �et�zec
              BufferedWriter vystup = new BufferedWriter(new FileWriter("C:\\kurs\\vystup.txt"));
              vystup.write(ret); vystup.newLine();
              vstup.close(); vystup.close();
          }   catch(FileNotFoundException e) {System.out.println(e+"Soubor nenalezen");}    
              catch (NumberFormatException e){ System.out.println(e+" nelze p�ev�st na ��slo");}     
              catch (IOException e){System.out.println(e+"Soubor nelze ��st");}
          System.out.println("v�sledek je "+vysl+" hodin."); 
    }     
}