import java.util.ArrayList;

public class Database {
    ArrayList<Superhero> superHeroes = new ArrayList<>();


    public void addSuperhero(Superhero superhero) {
        superHeroes.add(superhero);
    }

    public Superhero searchSuperhero(String søgning) {
        for (Superhero superhero : superHeroes) {

            if (superhero.getName().equalsIgnoreCase(søgning)) {
                return superhero;
            }
        }
        return null;
    }

    public ArrayList<Superhero>getSuperHeroes() {
        return superHeroes;
    }


}
