import java.util.ArrayList;

public class Database {
    ArrayList<Superhero> superHeroes = new ArrayList<>();


    public void addSuperhero(Superhero superhero) {
        superHeroes.add(superhero);
    }

    public ArrayList<Superhero> getSuperHeroes() {
        return superHeroes;
    }

    public Superhero searchSuperhero(String søgning) {
        for (Superhero superhero : superHeroes) {

            if (superhero.getName().equalsIgnoreCase(søgning)) {
                return superhero;
            }
        }
        return null;
    }

    //DETTE SKAL IMPLEMENTERES I MAIN KLASSEN --- editSuperhero bliver ikke brugt??
    public void editSuperhero(String currentName, Superhero newSuperhero) {
        Superhero SuperheroEdit = searchSuperhero(currentName);
        if (SuperheroEdit != null) {
            // Opdaterer superhelten nye oplysninger
            SuperheroEdit.setName(newSuperhero.getName());
            SuperheroEdit.setRealName(newSuperhero.getRealName());
            SuperheroEdit.setAge(newSuperhero.getAge());
            SuperheroEdit.setIsHuman(newSuperhero.getIsHuman());
            SuperheroEdit.setPowerlevel(newSuperhero.getPowerlevel());
        }

    }


}
