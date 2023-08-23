//Zadejte po�et dn� a hodin. Program vypo�te, kolik je to hodin (v�sledek m��e b�t re�ln� ��slo)
import java.io.*;
public class A1SoubMetoda
{   public static int ctiSoubInt(BufferedReader br)
    {   try
        {   //BufferedReader vstup = new BufferedReader(new FileReader("C:\\kurs\\hello.java")); //kdyby byl p��kaz zde, tak by se poka�d� �etlo od za��tku 
            String ret=br.readLine(); 
            return Integer.valueOf(ret).intValue();
        }   catch(FileNotFoundException e) {System.out.println(e+"Soubor nenalezen");return 1;}    
            catch (NumberFormatException e){ System.out.println(e+" nelze p�ev�st na ��slo"); return 2;}     
            catch (IOException e){System.out.println(e+"Soubor nelze ��st");return 3;}
    }
    public static void pisSoubInt(int i, BufferedWriter bw)
    {   try
        {   String ret=""+i;  //automatick� konverze na �et�zec
            bw.write(ret); bw.newLine();
        }   catch (IOException e){System.out.println(e+"Do souboru nelze zapsat");}
    }    
    public static void main(String [] args)
    {     //int hod,den,vysl;     //lok�ln� prom�nn� se neinicializuj�, proto p�i selh�n� �ten� je v prom�nn� nedefinovan� hodnota. kompil�tor nepust�
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
              catch (NumberFormatException e){ System.out.println(e+" nelze p�ev�st na ��slo");}     
              catch (IOException e){System.out.println(e+"Soubor nelze ��st");}
          System.out.println("v�sledek je "+vysl+" hodin."); 
    }     
}