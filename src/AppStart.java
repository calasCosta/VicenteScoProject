import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class ddsfa here.
 *
 * @author (Noami Calilo Costa)
 * @version (3/13/2020)
 */
public class AppStart
{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        Vicente vicente = new Vicente("Vicente Fernando");
        System.out.println("Cenário 1:");
        vicente.problema();

        System.out.println();

        System.out.print("\tO número máximo de votantes de votantes é igual a 10.\n");

        Amigos[] votantes = new Amigos[10];
        votantes[0] = new Amigos("Noami Costa",0);
        votantes[1] = new Amigos("Marciano Té",0);
        votantes[2] = new Amigos("Luis da Silva",0);
        votantes[3] = new Amigos("Watna Camala",0);
        votantes[4] = new Amigos("Osmin Iala",0);
        votantes[5] = new Amigos("Kelson Ndembo",0);
        votantes[6] = new Amigos("Uguis Mendes",0);
        votantes[7] = new Amigos("Ester Caetano",0);
        votantes[8] = new Amigos("Felizmelo Borja",0);
        votantes[9] = new Amigos("Aguibo Ture",0);

        System.out.println();

        System.out.println("Quem será o presidente da Mesa de Votos escolhido aleatoriamente entre os amigos do vicente ? ");
        PresidenteDeMesa presidenteDeMesa = new PresidenteDeMesa(votantes[rand.nextInt(10)].getNome());
        System.out.print("Será o Engenheiro "+ presidenteDeMesa.getNome());

        System.out.println("\n");

        System.out.println("Quem será o secretario da Mesa de Votos escolhido aleatoriamente entre os amigos do vicente ? ");
        PresidenteDeMesa secretarioDeMesa = new PresidenteDeMesa(votantes[rand.nextInt(10)].getNome());
        System.out.print("Será o Engenheiro "+ secretarioDeMesa.getNome());

        MesaDeVoto mesa = new MesaDeVoto(10, presidenteDeMesa.getNome());
        System.out.println("\n");
        System.out.println("Cenário 2: ");
        mesa.definirRegrasDeVoto();

        System.out.println("\n");

        System.out.println("Cenário 3: ");
        System.out.println("\t\t\tVotações");
        System.out.println("\n\t\t\tInício das votações");
        System.out.println("Data e hora de abertura da Mesa de votos: " + mesa.getDataHoraDeAbertura());

        int i = 0;
        while(i < mesa.getMaxVotantes()){
            System.out.println(votantes[i].getNome()+" votas sim ou nao?");
            votantes[i].setVoto(scanner.next());
            mesa.votar(votantes[i].getVoto());
            System.out.println(" Número atual de votos = "+ mesa.getNumeroAtualDeVotos());
            ++i;
        }

        System.out.println("\n\t\t\tFim das votações");
        System.out.println("Data e hora de abertura da Mesa de votos: " + mesa.getDataHoraDeFecho());

        System.out.println("\nAbertura da urna e contagem do votos");
        mesa.contarVotos();

        mesa.fazerActaSintise(presidenteDeMesa.getNome(), vicente.getName(), secretarioDeMesa.getNome());

        System.out.println("\nPrograma feito por Engenheiro Informático(kk) Noami Calilo Costa");
    }
}