package LibraryTeam;

import java.util.*;

public class Worker {
    HashSet<Professions> professions=new HashSet<Professions>();

    public Worker(){
    }

    public Worker(List<Professions> professions){
        HashSet<Professions> professionsList= new HashSet<>(professions);
        this.professions=professionsList;
    }

    public void addProfession(Professions profession){
        professions.add(profession);
    }
    public void addAllProfessions(List<Professions> listOfProfessions){
        professions.addAll(listOfProfessions);
    }

    public HashSet<Professions> getProfessions(){
        return professions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return Objects.equals(professions, worker.professions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(professions);
    }
    @Override
    public String toString() {
        return "Worker{" +
                "professions=" + professions +
                '}';
    }

}
