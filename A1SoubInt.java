import java.io.*;
public class A1SoubInt
{   public static void main(String [] args)
    {   int hod,den, vysl=0;
        try
        {   
            DataOutputStream vystup = new DataOutputStream (new FileOutputStream("c:\\kurs\\vst.txt"));
            vystup.writeInt(3); vystup.writeInt(2);  //pøíprava dat, náhrada vytvoøení vstupních dat v Notepadu
            vystup.close();
            DataInputStream vstup = new DataInputStream (new FileInputStream("c:\\kurs\\vst.txt"));
            hod=vstup.readInt(); den=vstup.readInt(); vstup.close(); 
            System.out.print(hod + "  " + den);
            vysl=den*24+hod;  
            System.out.print(" To je celkem hodin:  " + vysl);
            DataOutputStream vystup2 = new DataOutputStream (new FileOutputStream("c:\\kurs\\vyst.txt"));            
            vystup2.writeInt(vysl); vystup2.close(); 
        }   catch(IOException e) {System.out.println("Soubor nelze èíst");}      
    }
}