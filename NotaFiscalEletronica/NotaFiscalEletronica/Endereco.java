package NotaFiscalEletronica;

public class Endereco {

    String endereco;
    String municipio;
    String bairro;
    String uf;
    long cep;


    public Endereco() {
        
    }

    public Endereco(String endereco, String municipio, String bairro, String uf, long cep) {

        this.endereco = endereco;
        this.municipio = municipio;
        this.bairro = bairro;
        this.uf = uf;
        this.cep = cep;

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

    public long getCep() {

        return this.cep;

    }

    public void setCep(long cep) {

        this.cep = cep;
        
    }

}