import java.util.Scanner;

public class UserInterface {

    private Scanner scan;
    private Database db;

    //Benyttet til UserInterface
    public UserInterface() {
        scan = new Scanner(System.in);
        db = new Database();
    }

    /*
    Notat:

    - fiks boolean, den skal kunne registrerer både upper samt lowercases
    - eventuelt finde ud af hvordan hele programmet kan stoppe så brugeren ikke klikker 2
    og dernæst der popper en søgningskriterium frem.
    - lav scan.nextline på navn og rigtige navn
    - måske skal jeg tilføje kræfter
    - måske skal der fjernes break; hvis brugeren gerne vil ændre på flere oplysninger af superhelten

    */

    //Void da den ikke skal returnere noget værdi, den er koblet til Main klasse --> ui.startProgram();
    public void startProgram() {
        System.out.println("----------Velkommen til den ultimative Superhelt program 7000!!!!!----------");

        int NumberOfSuperheroes = 0;


        System.out.println(" ");

        System.out.println(">>>>>Denne program opretter den ønskede Superhelt som du laver!<<<<<");

        System.out.println(" ");

        System.out.println("Vil du fortsætte programmet? Tryk 1 og klik enter, hvis ikke tryk 2:");

        System.out.println(" ");

        int svar = scan.nextInt();

        while (svar == 1 && NumberOfSuperheroes < 3) {

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
            System.out.println(" ");

            System.out.println("Indtast superheltens styrke niveau:");
            double Powerlevel = scan.nextDouble();

            System.out.println(" ");
            Superhero superhero = new Superhero(name, Realname, age, isHuman == 'y' || isHuman == 'n', Powerlevel);
            db.addSuperhero(superhero);
            System.out.println(superhero);

            NumberOfSuperheroes++;

            if (NumberOfSuperheroes >= 3) {
                System.out.println("Du har oprettet 3 superhelte. Du kan ikke oprette flere.");
                System.out.println(db.getSuperHeroes());
                break;
            }

        }

        //DENNE HER DEL ER MIN SØGNINGSKRITERIUM SOM FINDER EN SUPERHELT UD FRA BRUGERENS SØGNING
        System.out.println("----------------Indtast superheltens navn du vil finde----------------");
        String søgning = scan.next();

        Superhero result = db.searchSuperhero(søgning); //metoden fra Database implementeret.

        //if samt else for at færdiggøre søgningen hvis en oprettet superhelt findes eller ej
        if (result == null) {
            System.out.println("Søgemaskinen kunne ikke finde den søgte superhelt ;( : " + søgning);
            System.out.println(" ");
        } else {
            System.out.println("YAAAAAAAY din superhelt blev fundet :D :");
            System.out.println(result);
            System.out.println(" ");
        }


        System.out.println("Indtast superhelten, du vil redigere:");
        String editSuperhero = scan.next();

        Superhero nuværendeSuperhero = db.searchSuperhero(editSuperhero);
        if (nuværendeSuperhero != null) {

            System.out.println("Hvilke oplysninger vil du ændre?");
            System.out.println("1. Navn");
            System.out.println("2. Rigtige navn");
            System.out.println("3. Alder");
            System.out.println("4. Er superhelten et menneske?");
            System.out.println("5. Superheltens styrkeniveau");
            int valg = scan.nextInt();

            switch (valg) {
                case 1:
                    System.out.println("Indtast det nye navn:");
                    String newName = scan.next();
                    nuværendeSuperhero.setName(newName);
                    break;
                case 2:
                    System.out.println("Indtast det nye rigtige navn:");
                    String newRealName = scan.next();
                    nuværendeSuperhero.setRealName(newRealName);
                    break;
                case 3:
                    System.out.println("Indtast den nye alder:");
                    int newAge = scan.nextInt();
                    nuværendeSuperhero.setAge(newAge);
                    break;
                case 4:
                    System.out.println("Er superhelten et menneske? (y/n):");
                    char newIsHuman = scan.next().toUpperCase().charAt(0);
                    nuværendeSuperhero.setIsHuman(newIsHuman == 'y' || newIsHuman == 'Y');
                    break;
                case 5:
                    System.out.println("Indtast det nye styrkeniveau:");
                    double newPowerLevel = scan.nextDouble();
                    nuværendeSuperhero.setPowerlevel(newPowerLevel);
                    break;
                default:
                    System.out.println("Ugyldigt valg.");
                    break;
            }
            System.out.println("Din superhelt er blevet opdateret til følgende: ");
            System.out.println(nuværendeSuperhero);
        }
    }
}


