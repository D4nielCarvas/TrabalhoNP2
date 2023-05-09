package NotaFiscalEletronica;

import java.util.InputMismatchException;

public class Endereco implements Interface {

    private String endereco;
    private String municipio;
    private String bairro;
    private String uf;
    private int cep;
    private int insc_estadual;


    public Endereco() {
        
    }

    public Endereco(String endereco, String municipio, String bairro, String uf, int cep, int insc_estadual) {

        this.endereco = endereco;
        this.municipio = municipio;
        this.bairro = bairro;
        this.uf = uf;
        this.cep = cep;
        this.insc_estadual = insc_estadual;

    }

    public String getEndereco() {

        return this.endereco;

    }

    public void setEndereco(String endereco) {

        this.endereco = endereco;

    }

    public String getMunicipio() {

        return this.municipio;

    }

    public void setMunicipio(String municipio) {

        this.municipio = municipio;

    }

    public String getBairro() {

        return this.bairro;

    }

    public void setBairro(String bairro) {

        this.bairro = bairro;

    }

    public String getUf() {

        return this.uf;

    }

    public void setUF(String uf) {

        this.uf = uf;

    }

    public int getCep() {

        return this.cep;

    }

    public void setCep(int cep) {

        this.cep = cep;
        
    }

    public int getInsc_estadual() {

        return this.insc_estadual;

    }

    public void setInsc_estadual(int insc_estadual) {

        this.insc_estadual = insc_estadual;

    }

    @Override
    public void entrar() {

        leia.nextLine();

        System.out.print("Endereço :>");
        setEndereco(leia.nextLine());

        System.out.print("Município :>");
        setMunicipio(leia.nextLine());

        System.out.print("Bairro :>");
        setBairro(leia.nextLine());

        System.out.print("UF :>");
        setUF(leia.nextLine());

        System.out.print("Inscrição Estadual :>");
        setInsc_estadual(Integer.parseInt(leia.nextLine()));

        while(true) {
            System.out.print("CEP :>");

            try {

                setCep(leia.nextInt());
                break;

            } catch (ImputMismatchException e) {
                System.out.println("Erro ao cadatrar o CEP.");
                System.out.println("O valor do CEP deve ser um Numero inteiro.");
                System.out.println("Tente novamente.");
                leia.nextLine();

            }
        }
    }


   @Override
   public void imprimir() {

        System.out.printf("Endereço ->" + getEndereco());
        System.out.printf("Município ->" + getMunicipio());
        System.out.printf("Bairro ->" + getBairro());
        System.out.printf("UF ->" + getUf());
        System.out.printf("CEP ->" + getCep());
        
    } 

    @Override
    public void alterar(){

    }

    @Override
    public void excluir(){

    }

    @Override
    public void consultar(){

    }

}