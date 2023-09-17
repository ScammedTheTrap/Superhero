public class Superhero {

    private String name;
    private String RealName;
    private int age;
    private boolean isHuman;
    //private int OriginAge;
    private double Powerlevel;

    //Konstruktør
    public Superhero(String name, String RealName, int age, boolean isHuman, double Powerlevel) {
        this.name = name;
        this.RealName = RealName;
        this.age = age;
        this.isHuman = isHuman;
        //this.OriginAge = OriginAge;
        this.Powerlevel = Powerlevel;

        //med this inddrager man det ovenstående, står der ikke this vil public demoting og nedenstående udelukke attributerne ovenstående

    }

    public String getName() {
        return name;


    }

    public String getRealName() {
        return RealName;


    }

    public int getAge() {
        return age;


    }

    public boolean isHuman() {
        return isHuman;


    }

    /*public int getOriginAge() {
        return OriginAge;
    }*/

    public double getPowerlevel() {
        return Powerlevel;
    }

    @Override
    public String toString() {
        String string = "";
                string += "Superheltens navn -> " + name + '\n';
                string += "RealName -> " + RealName + '\n';
                string += "age -> " + age + '\n';
                string += "Er superhelten et menneske? -> " + (isHuman ? "Ja" : "Nej") + '\n';
                string += "Superheltens styrke niveau -> " + Powerlevel + '\n' + '\n';
                return string;
    }

}
