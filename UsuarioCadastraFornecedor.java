import java.util.Scanner;

public class UsuarioCadastraFornecedor{

    //Metodo mostra tela
    public static void mostraTela(){
        System.out.println("[Classe fonteira UsuarioCadastraFornecedor] Mostra tela para cadastro de fornecedor.\n");

        // Recenbendo dados do usuario
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o nome do Fornecedor: ");
        String nome = teclado.nextLine();
        System.out.print("\nInforme o CNPJ: ");
        String cnpj = teclado.nextLine();
        System.out.println("");

        // Criando objeto Fornecedor
        Fornecedor fornecedor = new Fornecedor(nome, cnpj);

        // Verificando se o fornecedor for cadastrado com sucesso
        Boolean check = addFornecedor(fornecedor);

        // Printando para o usuario o resultado
        if(check){
            System.out.println("Fornecedor cadastrado com sucesso ! [Print Classe fornteira UsuarioCadastraFornecedor]\n");
        }else{
            System.out.println("Erro ao cadastrar fornecedor ! [Print Classe fornteira UsuarioCadastraFornecedor]\n");
        }
    }


    // Metodo para enviar o fornecedor para classe de controle
    private static Boolean addFornecedor(Fornecedor fornecedor){
        return CadastrarFornecedor.addFornecedor(fornecedor);
    }

    

    
}