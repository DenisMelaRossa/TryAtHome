package LibraryTeam;

import java.util.*;

public class TeamsOfTender {
    HashSet<Team> teamOfTender = new HashSet<Team>();

    public TeamsOfTender() {
    }

    public TeamsOfTender(List<Team> teamOfTender) {
        HashSet setOfTeams = new HashSet<>(teamOfTender);
        this.teamOfTender = setOfTeams;
    }

    public void addTeam(Team team) {
        teamOfTender.add(team);
    }

    public void addAllTeams(List<Team> listOfTeams) {
        teamOfTender.addAll(listOfTeams);
    }

    public boolean teamValidation(HashMap<Professions, Integer> requirements) {
        boolean result = true;
        int index = 0;
        Set set = requirements.entrySet();

        for (Object element : set) {

            Map.Entry mapEntry = ((Map.Entry) element);
            for (Team team : teamOfTender) {
                Integer haveProfessions = team.calculateNumberOfWorkersWithProfessionInTeam((Professions) mapEntry.getKey());
                Integer needProfessions = ((Integer) mapEntry.getValue());
                if (haveProfessions.compareTo(needProfessions) < 0) {
                    return false;
                } else if (index == set.size() - 1 && haveProfessions.compareTo(needProfessions) >= 0) {
                    result = true;
                }
                index++;
            }
        }
        return result;
    }

   /* public void del(TeamsOfTender tender){
        for (Team el: tender)
    }*/


    public Team findTeamWithMinCosts(HashMap<Professions, Integer> requirements) throws
            NoTeamsForProjectException {
        int minCosts = 0;
        Team teamResult= new Team();
        for (Team elementTeam : teamOfTender) {
            if (elementTeam.isSatisfyingRequirements(requirements) && elementTeam.getCosts() > minCosts) {
                teamResult=elementTeam;
            }
        }
        if (teamResult.team.isEmpty()) throw new NoTeamsForProjectException("No Team Was Found. Close Project");
        return teamResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamsOfTender that = (TeamsOfTender) o;
        return Objects.equals(teamOfTender, that.teamOfTender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamOfTender);
    }

    @Override
    public String toString() {
        return "TeamsOfTender{" +
                "teamOfTender=" + teamOfTender +
                '}';
    }
}
