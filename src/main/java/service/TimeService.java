package service;

import model.Jogador;
import model.Time;

import java.util.List;

public class TimeService {

    public void adicionarJogadorAoTime(Jogador novoJogador, Time time){           //novo jogador player1
        List<Jogador> jogadores = time.getJogadores();            //recupera jogadores atuais do time, exe: player 2 e player 3
        jogadores.add(novoJogador);                                     //adiciona player1 na lista de jogadores do time
        time.setJogadores(jogadores);                               //atualiza a nova lista de jogadores pro time

    }

}
