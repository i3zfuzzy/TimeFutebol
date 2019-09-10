package service;

import model.Campeonato;
import model.Time;

import java.util.List;

public class ServiceCampeonato {

        public void champion(Campeonato campeonato, Time times){
            List<Time> brasileirao = campeonato.getTimes();
            brasileirao.add(times);
            campeonato.setTimes(brasileirao);
        }
}
