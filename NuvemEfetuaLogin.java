import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class NuvemEfetuaLogin{

    // Metodo que procura na nuvem o login
    public static Boolean verificaLogin(Login login){

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("Nuvem.txt"))) {
            
            String linha = "";

            // Procura a area de login no arquivo
            do{
                linha = bufferedReader.readLine();
                
            }while(!linha.equals("Login Inicio"));


            // Compara o login com cada linha da area de login do arquivo 
            do{
                linha = bufferedReader.readLine();
                if(linha.equals(login.toString())){
                    return true;
                }                
            }while(!linha.equals("Login Fim"));

            bufferedReader.close();

            return false;

        } catch (IOException e) {
            return false;
        }
    }
}