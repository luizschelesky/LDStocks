import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;


public class NuvemAtualizaNuvem{

    public static Boolean addFornecedor(Fornecedor fornecedor){

        Queue<String> fila = new LinkedList<>();

        String texto;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("Nuvem.txt"))) {
            
            String linha = "";
            do{
                linha = bufferedReader.readLine();
                fila.add(linha);
                
            }while(!linha.equals("Fornecedores Inicio"));

            linha = fornecedor.getNome()+" "+fornecedor.getCnpj();
            fila.add(linha);

            do{
                linha = bufferedReader.readLine();
                if(linha != null){
                    fila.add(linha);
                }                
            }while(linha != null);

            bufferedReader.close();

            texto = "";
            linha = "";
            while(linha != null){
                texto = texto+linha+"\n";
                linha = fila.poll();
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("Nuvem.txt"))) {
                writer.write(texto);
                writer.close();
            } catch (IOException e) {
                return false;
            }

        } catch (IOException e) {
            return false;
        }


        return true;
    }

    public static Boolean cadastraProduto(Produto produto, Fornecedor fornecedor){

         Queue<String> fila = new LinkedList<>();

        String texto;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("Nuvem.txt"))) {
            
            String linha = "";
            do{
                linha = bufferedReader.readLine();
                fila.add(linha);
                if (linha == null){
                    break;
                }
            }while(!linha.equals("Produtos Inicio"));

            linha = produto.toString()+" "+fornecedor.toString();
            fila.add(linha);

            do{
                linha = bufferedReader.readLine();
                if(linha != null){
                    fila.add(linha);
                }                
            }while(linha != null);

            bufferedReader.close();

            texto = "";
            linha = "";
            while(linha != null){
                texto = texto+linha+"\n";
                linha = fila.poll();
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("Nuvem.txt"))) {
                writer.write(texto);
                writer.close();
            } catch (IOException e) {
                return false;
            }

        } catch (IOException e) {
            return false;
        }


        return true;
    }

    public static Boolean atualizaNuvem(Produto produto, String quantidade){

        /*
        

        informa o servidor que a loja recebeu os produtos
        
        
        */ 

        
        return false;
    }

    public static Boolean apagaProduto(Produto produto){

        /*
        

        codigo para apagar do servidor o produto
        
        
        */ 

        // Se conseguir enviar retorna true, se de erro retorna false
        return true;
    }

    public static Boolean adicionarCliente(Cliente cliente){

        /*
        

        codigo para apagar do servidor o produto
        
        
        */ 

        // Se conseguir enviar retorna true, se de erro retorna false
        return true;
    }
}