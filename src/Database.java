import java.util.ArrayList;

public class Database {
    ArrayList<Superhero> superHeroes = new ArrayList<>();


    public void addSuperhero(String name, String RealName, int age, boolean isHuman, double Powerlevel) {

        superHeroes.add(new Superhero(name, RealName, age, isHuman, Powerlevel));
    }

    public ArrayList<Superhero>getSuperHeroes() {
        return superHeroes;
    }

}
