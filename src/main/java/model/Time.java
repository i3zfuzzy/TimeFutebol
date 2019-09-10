package model;

import java.util.ArrayList;
import java.util.List;

public class Time {

    private String timeNome;

    private List<Jogador> jogadores = new ArrayList<>();


    public Time(String timeNome, List<Jogador> jogadores) {
        this.timeNome = timeNome;
        this.jogadores = jogadores;
    }

    public Time(String timeNome) {
        this.timeNome = timeNome;
    }

    public Time() {
    }

    public String getTimeNome() {
        return timeNome;
    }

    public void setTimeNome(String timeNome) {
        this.timeNome = timeNome;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    @Override
    public String toString() {
        return "Time{" +
                "timeNome='" + timeNome + '\'' +
                ", jogadores=" + jogadores +
                '}';
    }
}
