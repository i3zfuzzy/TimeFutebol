package model;

import java.util.ArrayList;
import java.util.List;

public class Campeonato {

    private List<Time> brasileirao = new ArrayList<>();

    public Campeonato() {
    }

    public Campeonato(List<Time> times) {
        this.brasileirao = times;
    }

    public List<Time> getTimes() {
        return brasileirao;
    }

    public void setTimes(List<Time> times) {
        this.brasileirao = times;
    }
}
