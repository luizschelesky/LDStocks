import java.util.Scanner;

public class UsuarioCadastraCliente{

    // Metodo para mostra a tela para o usuario cadastra a tela
    public static void mostraTela(){
        System.out.println("[Classe fonteira UsuarioCadastraCliente] Mostra tela para cadastrar novo cliente.\n");

        // Recenbendo dados do usuario
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o nome do cliente: ");
        String nome = teclado.nextLine();
        System.out.print("\nInforme o cpf do cliente: ");
        String cpf = teclado.nextLine();
        System.out.println("");

        Cliente cliente = new Cliente(nome, cpf);

        String resposta = CadastrarCliente.cadastrar(cliente);

        System.out.println("[Classe fonteira UsuarioCadastraCliente] Mensagem gerada pela classe controle -> "+resposta);
    }
}