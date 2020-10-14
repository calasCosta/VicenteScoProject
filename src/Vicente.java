/**
 * Write a description of class sdfas here.
 *
 * @author (Noami Calilo Costa)
 * @version (12/3/2020)
 */
public class Vicente{
    private String name;
    private int idade;
    private static final String cursoAntigo = "Engenharia Informática";
    private String cursoAtual;
    private boolean mudar;

    public Vicente(String nome){
        this.name = (name != null)?name:"Vicente";
    }

    public Vicente(String name, int idade, String cursoAtual){
        this.name = (name != null)?name:"Vicente";
        //A linha acima faz a mesma coisa com o if else de baixo
       /* if(name != null){
          this.name = name;
        } else { this.name = "Vicente"; }*/

        this.idade = (idade >= 20)?idade:20;
        this.cursoAtual = (cursoAtual != null)?cursoAtual: "É só voltar para engenharia informática, Já que não tens curso. kkk";
        mudar = false;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getIdade() {
        return idade;
    }

    public String getCursoAtual() {
        return cursoAtual;
    }

    public boolean getMudar(){
        return mudar;
    }
    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCursoAtual(String cursoAtual) {
        this.cursoAtual = cursoAtual;
    }

    public void vouMudar(){
        mudar = !mudar;
    }

    public void problema(){
        System.out.println("Vicente: Boas pessoal, Chamo-me Vicente Fernando, como todos sabem kkkkk... \n"+
                "\t É seguinte, eu estava connvosco nessa luta vs muito stress de ver/criar linhas e linhas de código \n"+
                "\t Infelizmente, acabei por mudar de curso por ter achado que Engenharia Informática não era/é para mim \n"+
                "\t Mas tenho uma boa notícia família, estou a pensar em voltar para EI, mas tudo vai depender de vocês.\n\n"+

                "Felizmelo: kkkkk... De nós? Tu és maluco. kkk\n\n"+

                "Vicente: Ei maluco Melo, o assunto sério. Deixa-me acabar... continuando, quero que façam uma votação, se o \n"+
                "\t o total de votos \"SIM\" for maior que o de \"NÃO\", vou voltar.\n\n"+

                "Kelson, Watna: Borrraaa pessoal \n\n"+

                "Uguis: Borraa");
    }
}