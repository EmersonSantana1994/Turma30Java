package Classes;

public class Celulares extends Produto {
    //ATRIBUTOS
    private String memoria;

    //METODOS

    public Celulares(String produto, int estoque, String codigo, double valor) {
        super(produto, estoque, codigo, valor);
        this.memoria = memoria;

    }


    //CONSTRUTORES


    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }
    @Override
    public void IncluiEstoque(int quantidade){
        if (quantidade > 2){
            System.out.println("Voc� ganhou um brinde, Parab�ns!!");
            this.estoque += quantidade;
        }else{
            this.estoque += quantidade;
        }
    }

}