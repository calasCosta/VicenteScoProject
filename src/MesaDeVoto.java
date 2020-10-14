import java.util.ArrayList;
import java.time.LocalDateTime;
/**
 * Write a description of class MesaDeVoto here.
 *
 * @author (Noami Calilo Costa)
 * @version (13/3/2020)
 */
public class MesaDeVoto
{
    private Vicente vicente;
    private Amigos[] votantes;
    private PresidenteDeMesa presidenteDeMesa;
    private int maxVotantes;
    private int numeroAtualDeVotos;
    private ArrayList<String> votos;

    private LocalDateTime dataHoraDeAbertura;
    private LocalDateTime dataHoraDeFecho;
    private LocalDateTime dataHoraDeActa;

    public MesaDeVoto(int maxVotantes, String nomeDePresidente){
        vicente = new Vicente("Vicente Fernando");
        this.maxVotantes = maxVotantes;
        votantes = new Amigos[this.maxVotantes];
        presidenteDeMesa = new PresidenteDeMesa(nomeDePresidente);
        votos = new ArrayList<>();
        numeroAtualDeVotos = 0;
    }

    public int getMaxVotantes(){
        return maxVotantes;
    }

    public int getNumeroAtualDeVotos(){
        return numeroAtualDeVotos;
    }

    public void recenciar(Amigos[] votantes){
        this.votantes =  votantes;
    }

    public void votar(String voto){
        if(numeroAtualDeVotos <= maxVotantes){
            //if(!votantes[i].getNome().equalsIgnoreCase("Amigo") )
            votos.add(numeroAtualDeVotos, voto);
            numeroAtualDeVotos++;
        }
    }

    public void contarVotos(){
        int n = 1;
        for(String a: votos)
            System.out.println( "Boletim nº " +n++ + " -> " + a);
    }

    public void fazerActaSintise(String presidenteDeMesa, String vicente, String secretario){
        int votosSim = 0;
        int votosNulo = 0;
        int votosNao = 0;
        for(String a: votos){
            if(a.equalsIgnoreCase("sim")){
                votosSim++;
            }
            else if(a.equalsIgnoreCase("nao")){
                votosNao++;
            }
            else{
                votosNulo++;
            }
        }

        if(votosSim > votosNulo && votosSim > votosNao){
            System.out.println(mensagem(votosSim, votosNao, votosNulo,presidenteDeMesa, vicente, secretario, "vai voltar para Engenharia Informática."));
        }
        else if(votosNao > votosSim){
            System.out.println(mensagem(votosSim, votosNao, votosNulo,presidenteDeMesa, vicente, secretario, "não vai voltar para Engenharia Informática."));
        }else{
            System.out.println(mensagem(votosSim, votosNao, votosNulo,presidenteDeMesa, vicente, secretario, "não vai voltar para Engenharia Informática."+
                    "visto ter um número demasiado de votos nulos."));
        }
    }

    public String mensagem(int votosSim, int votosNao, int votosNulo, String presidenteDeMesa, String vicente, String secretario, String voltaOuNao){

        return
                "\t\t\t\t   Acta Síntese\n"+
                        "\t Bialystok,"+ dataHoraDeActa.now().getDayOfMonth()+"/"+ dataHoraDeActa.now().getMonth()+"/"+dataHoraDeActa.now().getYear()+".\n\n"+
                        "\t Aos "+ getDataHoraDeAbertura()+ " decorreram a votações para volta ou não do Ex-Engenheiro "+ vicente + " para Engenharia Informatica"+
                        "\n\t em que votaram "+getNumeroAtualDeVotos()+ " amigos, no qual tivemos o seguinte resultado: \n"+

                        "\n\t Numero de votos \"sim\" = "+votosSim +
                        "\n\t Numero de votos \"nao\" = "+votosNao +
                        "\n\t Numero de votos \"nulo\" = "+votosNulo +

                        "\n\n\t Conhecidos os resultados das votações que iniciaram no dia "+ getDataHoraDeAbertura()+" e terminaram no dia \n\t "+
                        getDataHoraDeFecho()+ ". Declaro, na qualidade do Presidente da Mesa de votos, que o Ex-Engenheiro " + vicente + "\n\t "+
                        voltaOuNao +"\n\n\t" +

                        " Por ser verdade, abaixo seguem a assinatura do Presidente e a do Secretario de Mesa.\n\n"+
                        "\t\t\t\t Presidente : " + presidenteDeMesa +
                        "\n\t\t\t\t Secretário: " + secretario;
    }

    public LocalDateTime getDataHoraDeAbertura(){
        dataHoraDeAbertura = dataHoraDeAbertura.now();
        return dataHoraDeAbertura;
    }

    public LocalDateTime getDataHoraDeFecho(){
        dataHoraDeFecho = dataHoraDeFecho.now();
        return dataHoraDeFecho;
    }

    public LocalDateTime getDataHoraDeActa(){
        dataHoraDeActa = dataHoraDeActa.now();
        return dataHoraDeActa;
    }

    public void definirRegrasDeVoto(){
        System.out.println("\t\t Regras De Voto");
        System.out.println("\t 1: Se o voto for vâzio é considerado null");
        System.out.println("\t 2: Se votar \"SIM\" e \"NAO\" é considerado null");
        System.out.println("\t 3: Só é considerado voto válido se e só se o voto for \"SIM\" e ou \"NÃO\"");
        System.out.println("\t 4: Os votos não são secretos");
    }
}