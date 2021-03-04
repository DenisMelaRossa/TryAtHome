package LibraryTeam;

import java.util.*;

import static LibraryTeam.Professions.*;

public class LibraryMain {
    public static void main(String[] args) {
        ArrayList<Professions> worker1= new ArrayList<>(List.of(BUILDER, PAINTER, MANAGER));
        ArrayList<Professions> worker2= new ArrayList<>(List.of(BUILDER, PAINTER, CARPENTER, ELECTRICIAN));
        ArrayList<Professions> worker3=new ArrayList<>(List.of(FITTER,JOINER, BRICKLAYER));
        ArrayList<Professions> worker4= new ArrayList<>(List.of(BUILDER, PAINTER, MANAGER));

        List<ArrayList<Professions>> team1= new ArrayList<ArrayList<Professions>>();
        team1.add(worker4);
        team1.add(worker2);
        System.out.println(team1);

        Worker w1=new Worker();
        w1.addProfession(BRICKLAYER);
        w1.addProfession(PAINTER);

        System.out.println(w1.getProfessions());
        Worker w2= new Worker();
        w2.addAllProfessions(Arrays.asList(BRICKLAYER, PLASTERER,CONCRETEWORKER));
        System.out.println(w2.getProfessions());

        Team team2= new Team();
        team2.addAllWorkers(Arrays.asList(w1,w2));
        System.out.println(team2.getWorkers());
        System.out.println(team2.getListOfTeamProfessions());


    }
}
