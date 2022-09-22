import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args ) throws IOException{
        File file = new File("C:/Users/PICOS/DESKTOP/Projet_BDDA_BAITICHE_AHMEDZAID_BOUAKI_DERAI/DB/personne.txt");
        Scanner scannerOne= new Scanner(System.in);
        String choix="";
        BufferedReader lecteurAvecBuffer = null;
        String ligne;

        
        do{
            System.out.println("Add a person with ADD");
            System.out.println("Watch all the person with LIST");
            choix = scannerOne.nextLine();
            
            if (choix.contains("ADD")) {
                try{
                FileWriter fw= new FileWriter(file, true);
                BufferedWriter bw= new BufferedWriter(fw);
                bw.write( choix.substring(4) + "\n");
                bw.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            } else if(choix.contains("LIST")){
                System.out.println("Else");
                try{
	            lecteurAvecBuffer = new BufferedReader(new FileReader(file));
                }catch(IOException e){
                    System.out.println("Probelem d'ouverture");
                    System.out.println(e.getMessage());
                }
                while ((ligne = lecteurAvecBuffer.readLine()) != null)
                System.out.println(ligne);
                lecteurAvecBuffer.close();
            }
            
        }while(!choix.equals("QUIT"));
        scannerOne.close();
}}
