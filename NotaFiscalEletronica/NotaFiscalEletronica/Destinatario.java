package NotaFiscalEletronica;
import java.util.ArrayList;
import java.util.InputMismatchException;


public abstract class Destinatario {

    private String nome;
    private Endereco endereco;
    private Telefone telefone;
    private String data_emissao;
    private String data_saida;
    private String hora_saida;
    private long cpf;
    ArrayList<Destinatario> destinatario = new ArrayList<Destinatario>();


    public Destinatario(){

    }

    public Destinatario(String nome, String data_emissao, String data_saida, String hora_saida, long cpf, Endereco endereco, Telefone telefone){
       
        this.nome = nome;
        this.data_emissao = data_emissao;
        this.data_saida = data_saida;
        this.hora_saida = hora_saida;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;

    }

    public String getNome(){

        return this.nome;

    }

    public void setNome(String nome){

        this.nome = nome;

    }

    public String getData_emissao(){

        return this.data_emissao;

    }

    public void setData_emissao(String data_emissao){

        this.data_emissao = data_emissao;

    }

    public String getData_saida(){

        return this.data_saida;

    }

    public void setData_saida(String data_saida){

        this.data_saida = data_saida;

    }

    public String getHora_saida(){

        return this.hora_saida;

    }

    public void setHora_saida(String hora_saida){

        this.hora_saida = hora_saida;

    }

    public long getCpf(){

        return this.cpf;

    }

    public void setCpf(long cpf){

        this.cpf = cpf;

    }

    public Endereco getEndereco() {

        return this.endereco;

    }

    public void setEndereco(Endereco endereco) {

        this.endereco = endereco;

    }

    public Telefone getTelefone() {

        return this.telefone;

    }

    public void setTelefone(Telefone telefone) {

        this.telefone = telefone;

    }

    public void entrar() {

        System.out.print("Nome -> ");
        setNome(leia.nextLine());

        System.out.print("Data da emissão -> ");
        setData_emissao(leia.nextLine());

        System.out.print("Data de Saida -> ");
        setData_saida(leia.nextLine());

        System.out.print("Hora da Saida -> ");
        setHora_saida(leia.nextLine());

        while(true) {
            system.out.print("CPF ->");
            try {
                setCpf(leia.nextLong());
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro ao cadastrar CPF.");
                System.out.println("Tente novamente.");
                leia.nextLine();
            }
        }


    }

   

    



}