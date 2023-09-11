import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Velkommen til den ultimative Superhelt program 7000!!!!!");

        System.out.println(" ");

        System.out.println("Denne program opretter den ønskede Superhelt som du laver!");

        System.out.println(" ");

        System.out.println("Vil du fortsætte programmet? Tryk 1 og klik enter, hvis ikke tryk 2:");

        System.out.println(" ");

        int svar = scan.nextInt();

        if (svar == 1) {

            System.out.println("programmet fortsætter");
        }
        else if (svar == 2) {
            System.out.println("programmet stopper");
            scan.close();
            System.exit(0);
        }
        System.out.println(" ");

        System.out.println("Indtast superheltens navn:");

        String name = scan.next();

        System.out.println("Indtast superheltens Rigtige navn:");

        String Realname = scan.next();

        System.out.println("Indtast superheltens alder:");

        int age = scan.nextInt();

        System.out.println("Er superhelten et menneske? (y/n):");
        char isHuman = scan.next().charAt(0);

        if (isHuman == 'y' || isHuman == 'Y') {

            System.out.println("Superhelten er et menneske");

        } else if (isHuman == 'n' || isHuman == 'N') {

            System.out.println("Superhelten er ikke et menneske");
        }
        System.out.println("Indtast superheltens styrke niveau:");

        double Powerlevel = scan.nextDouble();

        System.out.println(" ");
        Superhero superhero = new Superhero(name, Realname, age, isHuman == 'y' || isHuman == 'n', Powerlevel);
        //boolean skal eventuelt fikses da hvis man har tastet n til ikke human, vil den printe true til human
        System.out.println(superhero.toString());


    }

}
