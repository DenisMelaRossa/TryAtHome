package LibraryTeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    int costs;
    List <Worker> team=new ArrayList<Worker>();

    public void setCosts(int costs){
        this.costs=costs;
    }

    public int getCosts(){
        return costs;
    }

    public void addWorker(Worker worker){
        team.add(worker);
    }

    public void addAllWorkers(List<Worker> listOfWorkers){
        team.addAll(listOfWorkers);
    }

    public List<Worker> getWorkers(){
        List<Worker> teamWorkers=new ArrayList<Worker>();
        for (Worker el:team){
            teamWorkers.add(el);
        }
        return teamWorkers;
    }

    public List<Professions> getListOfTeamProfessions(){
        List<Professions> teamProfessions=new ArrayList<Professions>();
        for (Worker el:team){
            teamProfessions.addAll(el.getProfessions());
        }
        return teamProfessions;
    }

}
