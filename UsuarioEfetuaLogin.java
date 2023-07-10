import java.util.Scanner;

public class UsuarioEfetuaLogin{

    public static Boolean mostraTela() {
       
        //Codigo para mostrar uma interface para o usuario
        System.out.println("---Mostrando tela de login para ususario [Print da classe fornteira UsusarioEfetuaLogin] ---\n");
        
        Scanner teclado = new Scanner(System.in);
        
        //Recebendo dados do usuario
        System.out.print("Nome: ");
        String nome = teclado.nextLine();
        System.out.print("Senha: ");
        String senha = teclado.nextLine();
        System.out.print("");

        Login login = new Login(nome, senha);

        if(EfetuaLogin.verificaLogin(login)){

            System.out.println("\tLogin verificado [Print da classe fronteira UsuarioEfetuaLogin]\n");
            return true;

        }else{

            // Login nao encontrado na base de dados
            System.out.println("\tLOGIN INVALIDO ! Tente novamente. [Printa da classe fronteira UsuarioEfetuaLogin]\n");
            return false;
        }
    }

    
    
}