/**
 * Write a description of class PresidenteDeMesa here.
 * * @author (your name)
 * @version (12/3/2020)
 */
public class PresidenteDeMesa {
    private String nome;
    private int idade;
    private boolean assinatura;

    public PresidenteDeMesa(String nome){
        this.nome = nome;
    }
    public PresidenteDeMesa(String nome, int idade)
    {
        this.nome = ((nome != null) ? nome:"");
        this.idade= ((idade >= 18)? idade:0);
        this.assinatura = false;
    }
    //getters
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public boolean getAssinatura(){
        return assinatura;
    }
    //setters
    public void setName(String nome){
        this.nome = ((nome != null)?nome:"");
    }
    public void setIdade(int idade){
        this.idade= ((idade >= 18)? idade:0);
    }
    public void addAssinatura(){
        assinatura = true;
    }
}
