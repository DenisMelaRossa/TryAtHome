/*
package LibraryTeam;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import static LibraryTeam.Professions.*;
import static org.junit.Assert.*;

public class TeamsOfTenderTest {
    Worker w1 = new Worker(Arrays.asList(PAINTER, PLASTERER));
    Worker w2 = new Worker(Arrays.asList(PAINTER, CONCRETEWORKER, ELECTRICIAN));
    Worker w3 = new Worker(Arrays.asList(FITTER, ENGINEER, MANAGER));
    Worker w4 = new Worker(Arrays.asList(BUILDER, CONCRETEWORKER, PAINTER));
    Worker w5 = new Worker(Arrays.asList(BUILDER, BRICKLAYER, PAINTER));
    Worker w6 = new Worker(Arrays.asList(CARPENTER, BRICKLAYER, CRANEOPERATOR));
    Worker w7 = new Worker(Arrays.asList(ELECTRICIAN, FITTER, MANAGER));
    Worker w8 = new Worker(Arrays.asList(FITTER, ENGINEER, MANAGER));
    Worker w9 = new Worker(Arrays.asList(CARPENTER, BRICKLAYER, CRANEOPERATOR));
    Worker w10 = new Worker(Arrays.asList(PAINTER, PLASTERER));




    Team team1 = new Team("Team1", 100, Arrays.asList(w1));
    Team team2= new Team("Team2", 150, Arrays.asList(w2,w3));
    Team team3= new Team("Team3", 200, Arrays.asList(w4,w5,w6));
    Team team4= new Team("Team4", 250, Arrays.asList(w7,w8,w9,w10));


    TeamsOfTender tender1= new TeamsOfTender(Arrays.asList(team1));
    TeamsOfTender tender2= new TeamsOfTender(Arrays.asList(team1,team2,team3,team4));


    HashMap<Professions, Integer> requirements1 = new HashMap() {{
        put(PAINTER, 1);
    }};
    HashMap<Professions, Integer> requirements2 = new HashMap() {{
        put(PAINTER, 6);
    }};
    HashMap<Professions, Integer> requirements3 = new HashMap() {{
        put(BRICKLAYER, 1);
        put(CARPENTER, 1);
        put(CRANEOPERATOR, 1);
        put(ELECTRICIAN, 1);
        put(FITTER, 2);
        put(MANAGER, 2);

    }};

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void OneTeamTest() throws NoTeamsForProjectException {
        String[] actual = tender1.findTeamWithMinCosts(requirements1);
        String[] expected = {"Team1", "100"};
        assertArrayEquals(actual, expected);

    }

    @Test
    public void FourTeamTest() throws NoTeamsForProjectException {
        String[] actual = tender2.findTeamWithMinCosts(requirements3);
        String[] expected = {"Team4", "250"};
        assertArrayEquals(actual, expected);

    }
    @Test(expected = NoTeamsForProjectException.class)
    public void NoTeamIsFoundTest() throws NoTeamsForProjectException {
        tender1.findTeamWithMinCosts(requirements2);
    }
}*/
