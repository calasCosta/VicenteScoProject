/**
 * Write a description of class dsaf here.
 *
 * @author (Noami Calilo Costa)
 * @version (12/3/2020)
 */
public class Amigos {
    private String nome;
    private int idade;
    private String voto;

    /**
     * Construtor para inicialização do atributos declarado acima.
     * @param
     */
    public Amigos(String nome, int idade)
    {
        if(nome != null){
            this.nome = nome;
        } else {
            this.nome = "Amigo";
        }

        if(idade >= 18){
            this.idade = idade;
        }else {
            this.idade = 18;
        }

    }

    //getters
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getVoto(){
        return voto;
    }

    //setters
    public void setName(String nome){
        if(nome != null){
            this.nome = nome;
        } else {
            this.nome = "Amigo";
        }
    }

    public void setIdade(int idade){
        if(idade >= 18){
            this.idade = idade;
        }else {
            this.idade = 18;
        }
    }

    public void setVoto(String voto){
        if(voto.equalsIgnoreCase("sim") || voto.equalsIgnoreCase("nao")){
            this.voto = voto;
        }else{
            this.voto = "Nulo";
        }
    }
}