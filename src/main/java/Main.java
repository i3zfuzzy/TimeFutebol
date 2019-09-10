import model.Campeonato;
import model.Jogador;
import model.Time;
import service.TimeService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Campeonato campeonato = new Campeonato();


        while (true) {
            TimeService timeService = new TimeService();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu Campeonato \n" +
                    "1 - Cadastrar Times no Campeonato Brasileiro \n" +
                    "2 - Listar Times cadastrados no Campeonato \n" +
                    "3 - Cadastrar jogadores em um Time \n" +
                    "4 - Listar jogadores cadastrados no Time \n" +
                    "5 - Sair.");


            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Informe o nome do Time: ");
                    String nomeTime = scanner.next();
                    Time time = new Time(nomeTime);
                    List<Time> timesExist = campeonato.getTimes();
                    timesExist.add(time);
                    for (Time t : campeonato.getTimes()) {
                        System.out.println(t.toString());
                    }
                    break;
                case 3:
                    System.out.println("Infome o Nome: ");
                    String nome = scanner.next();
                    System.out.println("Informe a Posição: ");
                    String posicao = scanner.next();
                    System.out.println("Informe o Número: ");
                    String numero = scanner.next();
                    Jogador novoJogador = new Jogador(nome, posicao, numero);
                    System.out.println("Qual time o jogador sera cadastrado: ");
                    String timeEscolhido = scanner.next();
                    for (Time i : campeonato.getTimes()) {
                        if (i.getTimeNome().equals(timeEscolhido)) {
                            List<Jogador> jogadoresExistentes = i.getJogadores();
                            jogadoresExistentes.add(novoJogador);
                            i.setJogadores(jogadoresExistentes);
                        }

                    }
                    break;
                case 4:
                    //Time time1 = new Time();
                    for(Time j: campeonato.getTimes()){
                        System.out.println(j.toString());
                    }

                    break;
            }


        }


    }
}
