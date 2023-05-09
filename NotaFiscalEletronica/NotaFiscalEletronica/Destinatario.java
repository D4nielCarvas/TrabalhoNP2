package NotaFiscalEletronica;
import java.util.ArrayList;

import javax.management.StringValueExp;

public abstract class Destinatario {

    private String nome;
    private String endereco;
    private String municipio;
    private String bairro;
    private String uf;
    private String data_emissao;
    private String data_saida;
    private String hora_saida;
    private long fone;
    private long cpf;
    private long cep;
    private long insc_estadual;
    ArrayList<Destinatario> destinatario;


    public Destinatario(){

    }

    public Destinatario(String nome, String endereco, String municipio, String bairro, String uf,String data_emissao, String data_saida, String hora_saida, long fone, long cpf, long cep, long insc_estadual){
       
        this.nome = nome;
        this.endereco = endereco;
        this.municipio = municipio;
        this.bairro = bairro;
        this.uf = uf;
        this.data_emissao = data_emissao;
        this.data_saida = data_saida;
        this.hora_saida = hora_saida;
        this.fone = fone;
        this.cpf = cpf;
        this.cep = cep;
        this.insc_estadual = insc_estadual;

    }

    public String getNome(){

        return this.nome = nome;

    }

    public void setNome(String nome){

        this.nome = nome;

    }

    public String getEndereco(){
        
        return this.endereco = endereco;

    }

    public void setEndereco(String endereco){

        this.endereco = endereco;

    }

    public String getMunicipio(){

        return this.municipio = municipio;

    }

    public void setMunicipio(String municipio){

        this.municipio = municipio;
        
    }

    public String getBairro(){

        return this.bairro = bairro;

    }

    public void setBairro(String bairro){

        this.bairro = bairro;

    }

    public String getUf(){

        return this.uf = uf;

    }

    public void setUf(String uf){

        this.uf = uf;

    }

    public String getData_emissao(){

        return this.data_emissao = data_emissao;

    }

    public void setData_emissao(String data_emissao){

        this.data_emissao = data_emissao;

    }

    public String getData_saida(){

        return this.data_saida = data_saida;

    }

    public void setData_saida(String data_saida){

        this.data_saida = data_saida;

    }

    public String getHora_saida(){

        return this.hora_saida = hora_saida;

    }

    public void setHora_saida(String hora_saida){

        this.hora_saida = hora_saida;

    }

    public long getFone(){

        return this.fone = fone;

    }

    public void setFone(long fone){

        this.fone = fone;

    }

    public long getCpf(){

        return this.cpf = cpf;

    }

    public void setCpf(long cpf){

        this.cpf = cpf;

    }

    public long getCep(){
        
        return this.cep = cep;

    }

    public void setCep(long cep){

        this.cep = cep;

    }

    public long getInsc_estadual(){
        
        return this.insc_estadual = insc_estadual;

    }

    public void setInsc_estadual(long insc_estadual){

        this.insc_estadual = insc_estadual;

    }

    public ArrayList<Destinatario> destinatarioFaker(int times) {
        destinatario = new ArrayList<>(destinatario);
        for(int i = 1; i <= times; i++) {
            String nome = new Nome(i, Integer.parseInt(String.valueOf(i) + String.valueOf(i)));
        }
    }

   

    



}