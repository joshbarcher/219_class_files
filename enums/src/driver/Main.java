package driver;

import user.Person;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    private Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        Main program = new Main();

        String[] titles = {"Mr", "Mrs", "Miss", "Sir", "Madam", "Maam"};

        String title = program.promptForString("Enter a title from: " +
                Arrays.toString(titles));
        String fName = program.promptForString("Enter first name");
        String lName = program.promptForString("Enter first name");
        String nickName = program.promptForString("Enter nickname");

        Person user = new Person(title, fName, lName, nickName);

        System.out.println("Thanks for playing - " + user.toString());
    }

    private String promptForString(String prompt)
    {
        System.out.println(prompt);
        return console.nextLine();
    }
}

