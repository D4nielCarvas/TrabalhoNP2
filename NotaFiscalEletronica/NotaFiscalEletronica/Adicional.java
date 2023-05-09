package NotaFiscalEletronica;

import java.util.ArrayList;


public class Adicional {

    private int id;
    private int quantidade;
    private int cod;
    private String marca;
    private String especie;
    private float peso_liquido;
    private float peso_bruto;
    private long numeracao;
    private double desconto;
    ArrayList<Adicional> adicional;

    public Adicional() {
        adicional = new ArrayList<>();
    }

    public Adicional(int id, int quantidade, int cod, String marca, String especie, float peso_liquido, float peso_bruto, long numeracao, double desconto) {
        this.id = id;
        this.quantidade = quantidade;
        this.cod = cod;
        this.marca = marca;
        this.especie = especie;
        this.peso_liquido = peso_liquido;
        this.peso_bruto = peso_bruto;
        this.numeracao = numeracao;     
    }

   public int getId() {

        return this.id;

   }

   public void setId(int id) {

        this.id = id;

   }

   public int getQuantidade() {

        return this.quantidade;

   }

   public void setQuantidade(int quantidade) {

        this.quantidade = quantidade;

   }

   public int getCod() {

        return this.cod;

   }

   public void setCod(int cod) 
    
    public ArrayList<Adicional> adicionalFaker(int times) {
        //fakers
    }
}