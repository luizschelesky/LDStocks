public class Login{

    //Atributos
    private String nome;
    private String senha;

    //Metodo construtor
    public Login(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome(){
        return this.nome;
    }

    public String getSenha(){
        return this.senha;
    }

    public String toString(){
        return getNome()+getSenha();
    } 
}