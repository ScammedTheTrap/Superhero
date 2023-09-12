import java.util.Scanner;
/*
NOTAT:
- DER SKAL VÆRE MULIGHED HVOR HVER INDTASTNING AF SUPERHELT, NÅR DEN LOOPER VIDERE TIL EN NY, SKAL BRUGEREN
HAVE MULIGHED FOR AT AFSLUTTE PROGRAMMET

- lave en get metode som kan returnerer arraylisten

- DER SKAL EVENTUELT ÆNDRES VED ISHUMAN SÅ DET IKKE ER EN BOOLEAN DA BRUGEREN IKKE VIL HAVE TRUE/FALSE STATEMENTS
*/


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Database data = new Database();

        System.out.println("----------Velkommen til den ultimative Superhelt program 7000!!!!!----------");

        System.out.println(" ");

        System.out.println(">>>>>Denne program opretter den ønskede Superhelt som du laver!<<<<<");

        System.out.println(" ");

        System.out.println("Vil du fortsætte programmet? Tryk 1 og klik enter, hvis ikke tryk 2:");

        System.out.println(" ");

        int svar = scan.nextInt();

        while (svar == 1) {

            System.out.println("programmet fortsætter");

            System.out.println(" ");

            System.out.println("Indtast superheltens navn:");

            String name = scan.next();

            System.out.println("Indtast superheltens Rigtige navn:");

            String Realname = scan.next();

            System.out.println("Indtast superheltens alder:");

            int age = scan.nextInt();

            System.out.println("Er superhelten et menneske? (y/n):");
            char isHuman = scan.next().toUpperCase().charAt(0);

            if (isHuman == 'y' || isHuman == 'Y') {

                System.out.println("Superhelten er et menneske :D");

            } else if (isHuman == 'n' || isHuman == 'N') {

                System.out.println("Superhelten er ikke et menneske :O");
            }
            System.out.println("Indtast superheltens styrke niveau:");

            double Powerlevel = scan.nextDouble();

            System.out.println(" ");
            data.addSuperhero(name, Realname, age, isHuman == 'y' || isHuman == 'n', Powerlevel);
            System.out.println(data.getSuperHeroes());

            Superhero superhero = new Superhero(name, Realname, age, isHuman == 'y' || isHuman == 'n', Powerlevel);
            System.out.println(data);
        } if (svar == 2) {
            System.out.println("Programmet stopper.");


        }

    }
}
