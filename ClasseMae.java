package Classes;

public class ClasseMae {
    //ATRIBUTOS
    protected String produto;
    protected int estoque;
    protected String codigo;
    protected double valor;

    //METODOS
    public ClasseMae(String produto, int estoque, String codigo, double valor) {
        super();
        this.produto = produto;
        this.estoque = estoque;
        this.valor = valor;
        this.codigo = codigo;
    }

    //ENCAPSULAMENTO -- GETTERS and SETTERS

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    
    public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void incluiEstoque(int quantidade) {
 		if (quantidade <= 0) {
 			System.out.println("Quantidade incorreta!!! Tente de novo!!!");
 		} else {
 			this.estoque = this.estoque + quantidade;
 		}

}
}