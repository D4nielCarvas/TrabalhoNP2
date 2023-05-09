package NotaFiscalEletronica;

import java.util.ArrayList;


public class Transportador {

    private int id;
    private long razao_social;
    private Endereco endereco;
    private double frete;
    private int cod;
    private long cpf;
    ArrayList<Transportador> transportador;



    public Transportador() {
        transportador = new ArrayList<>();
    }

    public Transportador(int id, long razao_social, Endereco endereco, double frete, int cod, long cpf) {

        this.id = id;
        this.razao_social = razao_social;
        this.endereco = endereco;
        this.frete = frete;
        this.cod = cod;
        this.cpf = cpf;
        
    }

    public int getId() {

        return this.id;

    }

    public void setId(int id) {

        this.id = id;
        
    }

    public long getRazao_social() {

        return this.razao_social;

    }

    public void setRazao_social(long razao_social) {

        this.razao_social = razao_social;

    }

    public Endereco getEndereco() {

        return this.endereco;

    }

    public void setEndereco(Endereco endereco) {

        this.endereco = endereco;

    }

    public double getFrete() {

        return this.frete;

    }

    public void setFrete(double frete) { 

        this.frete = frete;

    }

    public int getCod() {

        return this.cod;

    }

    public void setCod(int cod) {

        this.cod = cod;

    }

    public long getCpf() {

        return this.cpf;

    }

    public void setCpf(long cpf) {

        this.cpf = cpf;

    }

    
    public ArrayList<Transportador> transportadorFaker(int times) {
        return null;
        
    }
}