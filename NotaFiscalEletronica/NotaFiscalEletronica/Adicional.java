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
        this.desconto = desconto;    
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

   public void setCod(int cod) {

          this.cod = cod;

   }

   public String getMarca() {

          return this.marca;

   }

   public void setMarca(String marca) {

          this.marca = marca;

   }

   public String getEspecie() {

          return this.especie;

   }

   public void setEspecie(String especie) {

          this.especie = especie;

   }

   public float getPeso_liquido() {

          return this.peso_liquido;

   }

   public void setPesoliquido(float peso_liquido) {

          this.peso_liquido = peso_liquido;

   }

   public float getPeso_bruto() {

          return this.peso_bruto;

   }

   public void setPeso_bruto(float peso_bruto) {

          this.peso_bruto = peso_bruto;

   }

   public long getNumerecao() {

          return this.numeracao;

   }

   public void setNumeracao(long numeracao) {

          this.numeracao = numeracao;

   }

   public double getDesconto() {

          return this.desconto;

   }

   public void setDesconto(double desconto) {

          this.desconto = desconto;
          
   }
    
    public ArrayList<Adicional> adicionalFaker(int times) {
        //fakers
    }
}