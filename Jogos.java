package Classes;

public class Jogos extends ClasseMae{
    //ATRIBUTOS
    private String nome;

    public Jogos(String produto, int estoque, String codigo, double valor, String nome) {
        super(produto, estoque, codigo, valor);
        this.nome = nome;
    }
    //METODOS

    //ENCAPSULAMENTO
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
 
      public void incluiEstoque(int quantidade) {
		if (quantidade <= 0) {
			System.out.println("Você ganhou um Brinde!!!");
			this.estoque = this.estoque + quantidade;
		} else {
			this.estoque = this.estoque + quantidade;
		}
}
}