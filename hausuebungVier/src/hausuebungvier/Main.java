/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hausuebungvier;

import com.sun.org.apache.xerces.internal.xs.StringList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elias
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        List<Integer> zahlen = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("numbers.csv"));
            String s = br.readLine();
            while(s!=null)
            {
                String[] sarr = s.split(":");
                List <String> Stringlist= new ArrayList<>();
                
                for (int i = 0; i < sarr.length; i++){
                    Stringlist.add(sarr[i]);
                }
                for (int i = 0; i < Stringlist.size(); i++) {
                   try
                {
                    int zahl = Integer.parseInt(Stringlist.get(i));
                    zahlen.add(i);
                    
                }catch(NumberFormatException e)
                {
                    System.out.println("Gabriel ist besser in Minecraft als ich");
                }
                }
                s = br.readLine();
            }
                
                
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
                    zahlen.stream().forEach(i -> System.out.println(i));

    }
}
