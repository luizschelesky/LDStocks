public class Fornecedor{
    private String nome;
    private String cnpj;
    private String fornecedor;

    public Fornecedor(String fornecedor){
        this.fornecedor = fornecedor;
        this.nome = "";
        this.cnpj = "";
    }
    
    public Fornecedor(String nome, String cnpj){
        this.nome = nome;
        this.cnpj = cnpj;
        this.fornecedor = cnpj;
    }

    public String getFornecedor(){
        return this.fornecedor;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getCnpj(){
        return this.cnpj;
    }

    public String toString(){
        return this.fornecedor;
    }
}