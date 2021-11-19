
package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreationMenu {

    public static void main(String[] args) {

        ArrayList<Archetype> characterList = new ArrayList<>();



        int userSelection;

        userSelection = createCharacterMenu();
        switch (userSelection) {
            case 1 -> characterCreation();

            case 2 -> {
                System.out.println(characterList);
                createCharacterMenu();
            }


            default -> System.out.println("Error");
        }

        int classSelection;

        classSelection = characterCreation();
        switch (classSelection) {

            case 1:
                System.out.println("You choose a peasant");
                Paysan peasant = new Paysan("Paysan");
                characterList.add(peasant);
                characterName(peasant);
                break;


            case 2:
                System.out.println("You choose a warrior");
                Warrior warrior = new Warrior();
                characterList.add(warrior);
                characterName(warrior);
                break;


            case 3:
                System.out.println("You choose a wizard");
                Mage wizard = new Mage();
                characterList.add(wizard);
                characterName(wizard);
                break;

            case 4:
                System.out.println("You choose a thief");
                Thief thief = new Thief();
                characterName(thief);
                characterList.add(thief);
                System.out.println();
                break;

            default:
                System.out.println("Error");
                break;


        }




    }
    public static int createCharacterMenu() {

        Scanner sc = new Scanner(System.in);
        int userSelection;

        System.out.println("Choose a character or create a new one");
        System.out.println("---------------");
        System.out.println("1 - Create a new character");
        System.out.println("2 - View all characters");

        userSelection = sc.nextInt();
        return userSelection;


    }

    public static int characterCreation(){

        Scanner sc2 = new Scanner(System.in);
        int classSelection;

        System.out.println("choose your class");
        System.out.println("----------------");
        System.out.println("1 - Peasant");
        System.out.println("2 - Warrior");
        System.out.println("3 - Wizard");
        System.out.println("4 - Thief");
        classSelection = sc2.nextInt();
        return classSelection;
    }

    public static String characterName(Archetype classSelection){

        Scanner sc3 = new Scanner(System.in);

        System.out.println("choose a name");
        String name = sc3.next();


        System.out.println("you choose a " + classSelection.getType() + " named " + name);
        System.out.println("  ");
        System.out.println("  ");
        classSelection.name = name;

        createCharacterMenu();
        return name;


    }



}