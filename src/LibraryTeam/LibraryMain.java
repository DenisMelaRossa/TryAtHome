package LibraryTeam;

import java.util.*;

import static LibraryTeam.Professions.*;

public class LibraryMain  {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.addProfession(BRICKLAYER);
        w1.addProfession(PAINTER);
        System.out.println(w1.getProfessions());

        Worker w2 = new Worker();
        w2.addAllProfessions(Arrays.asList(BRICKLAYER, PLASTERER, CONCRETEWORKER));
        System.out.println(w2.getProfessions());

        Team team1 = new Team();
        team1.setTeamName("team1");
        team1.setCosts(200);
        team1.addAllWorkers(Arrays.asList(w1, w2));
        System.out.println(team1.calculateNumberOfWorkersWithProfessionInTeam(BRICKLAYER));

        Worker w3 = new Worker();
        w3.addAllProfessions(Arrays.asList(CARPENTER, MANAGER, FITTER));

        Worker w4 = new Worker();
        w4.addAllProfessions(Arrays.asList(ELECTRICIAN, ENGINEER, JOINER));

        Team team2 = new Team();
        team2.setTeamName("team2");
        team2.setCosts(100);
        team2.addAllWorkers(Arrays.asList(w3, w4));


        TeamsOfTender tender = new TeamsOfTender();
        tender.addAllTeams(Arrays.asList(team1, team2));

       /* for (Team team:tender){
            System.out.println(team.toString());
        }
*/


        HashMap<Professions, Integer> requirement = new HashMap<Professions, Integer>();
        requirement.put(BRICKLAYER, 2);
        requirement.put(PLASTERER, 1);
        System.out.println(team1.calculateNumberOfWorkersWithProfessionInTeam(PLASTERER));
        boolean c= team1.isSatisfyingRequirements(requirement);
        System.out.println(c);

        HashMap<Professions, Integer> requirement2 = new HashMap<Professions, Integer>();
        requirement2.put(BUILDER, 1);
/*
        String[] r=tender.findTeamWithMinCosts(requirement2);
*/


        Worker w6= new Worker(Arrays.asList(BRICKLAYER, PAINTER,PAINTER,PAINTER));
        System.out.println(w6.getProfessions());
        Team team3=new Team("team3",150,Arrays.asList(w6));
        System.out.println(team3.calculateNumberOfWorkersWithProfessionInTeam(PAINTER));
        System.out.println(team3.isSatisfyingRequirements(requirement));

        System.out.println(w1.toString());
        System.out.println(team1.toString());
        System.out.println(tender.toString());


        String[] arr=new String[2];

        Team r=new Team();
        System.out.println(r.team.isEmpty());
    }

}
