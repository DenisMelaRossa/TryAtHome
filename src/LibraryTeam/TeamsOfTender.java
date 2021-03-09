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

    public String[] findTeamWithMinCosts(HashMap<Professions, Integer> requirements) throws
            NoTeamsForProjectException {
        String[] result = new String[2];
        int minCosts = 0;
        for (Team elementTeam : teamOfTender) {
            if (elementTeam.isSatisfyingRequirements(requirements) && elementTeam.getCosts() > minCosts) {
                result[0] = elementTeam.getTeamName();
                result[1] = "" + elementTeam.getCosts();
            }
        }
        if (result[0] == null) throw new NoTeamsForProjectException("No Team Was Found. Close Project");
        return result;
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
