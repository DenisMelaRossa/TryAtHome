package LibraryTeam;

import java.util.*;

public class Team {
    private int costs;
    private String teamName;
    HashSet<Worker> team = new HashSet<Worker>();

    public Team() {
    }

    public Team(String teamName, int costs, List<Worker> team) {
        this.teamName = teamName;
        this.costs=costs;
        HashSet teamSet=new HashSet(team);
        this.team=teamSet;
    }

    public void setCosts(int costs) {
        this.costs = costs;
    }

    public int getCosts() {
        return costs;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void addWorker(Worker worker) {
        team.add(worker);
    }

    public void addAllWorkers(List<Worker> listOfWorkers) {
        team.addAll(listOfWorkers);
    }

    public Integer calculateNumberOfWorkersWithProfessionInTeam(Professions profession) {
        ArrayList<Professions> teamProfessions = new ArrayList<Professions>();
        for (Worker elementWorker : team) {
            teamProfessions.addAll(elementWorker.getProfessions());
        }
        Integer count = 0;
        for (Professions elementProfession : teamProfessions) {
            if (elementProfession.compareTo(profession) == 0) count++;
        }
        return count;
    }


    public boolean isSatisfyingRequirements(HashMap<Professions, Integer> requirements) {
        boolean result = true;
        int index = 0;
        Set set = requirements.entrySet();

        for (Object element : set) {

            Map.Entry mapEntry = ((Map.Entry) element);
            Integer haveProfessions = calculateNumberOfWorkersWithProfessionInTeam((Professions) mapEntry.getKey());
            Integer needProfessions = ((Integer) mapEntry.getValue());
            if (haveProfessions.compareTo(needProfessions) < 0) {
                return false;
            } else if (index == set.size() - 1 && haveProfessions.compareTo(needProfessions) >= 0) {
                result = true;
            }
            index++;
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team1 = (Team) o;
        return costs == team1.costs &&
                Objects.equals(teamName, team1.teamName) &&
                Objects.equals(team, team1.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(costs, teamName, team);
    }

    @Override
    public String toString() {
        return "Team{" +
                "costs=" + costs +
                ", teamName='" + teamName + '\'' +
                ", team=" + team +
                '}';
    }
}
