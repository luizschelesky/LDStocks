public class Produto{

    private String nome;
    private String modelo;
    private String preco;

    public Produto(String modelo){
        this.nome = "";
        this.modelo = modelo;
        this.preco = "";
    }

    public Produto(String nome, String modelo, String preco){
        this.nome =nome;
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getNome(){
        return this.nome;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public String getPreco(){
        return this.preco;
    }

    public String toString(){
        return this.nome+" "+this.modelo+" "+this.preco;
    }
}