package NotaFiscalEletronica;

public class Telefone {

    private int ddd;
    private int numero;

    public Telefone() {

    }

    public Telefone(int ddd, int numero) {

        this.ddd = ddd;
        this.numero = numero;

    }

    public int getDdd() {

        return this.ddd;

    }

    public void setDdd(int ddd) {

        this.ddd = ddd;

    }

    public int numero() {

        return this.numero;

    }

    public void setNumero(int numero) {

        this.numero = numero;

    }
    

}