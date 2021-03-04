package LibraryTeam;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    List<Professions> professions=new ArrayList<Professions>();

    public void addProfession(Professions profession){
        professions.add(profession);
    }
    public void addAllProfessions(List<Professions> listOfProfessions){
        professions.addAll(listOfProfessions);
    }

    public List<Professions> getProfessions(){
        return professions;
    }
}
