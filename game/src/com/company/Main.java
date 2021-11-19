package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //SELECTION DU PREMIER CHAMPION
static Player selectionChampion(Player paysan, Player guerrier, Player magician, Player thief, ArrayList list){

    System.out.println("""
                Choose Your First Player :

                1 - Peasant ⚜️
                2 - Warrior ⚔️
                3 - Wizard ☄️
                4 - Thief ♠️
                """);
    Scanner scan = new Scanner(System.in);
    String choice = scan.next();

    Player personagesChoice;

    if (choice.equals("1")) {
        personagesChoice = paysan;
        list.add(personagesChoice);
        System.out.println(" ");
        System.out.println("You Choose The " + paysan.getName());
        System.out.println(" ");
        System.out.println("Stats Of This Character : ");
        System.out.println(paysan);
        System.out.println(" ");
    } else if (choice.equals("2")) {
        personagesChoice = guerrier;
        list.add(personagesChoice);
        System.out.println("You Choose The " + guerrier.getName());
        System.out.println(" ");
        System.out.println("Stats Of This Character : ");
        System.out.println(guerrier);
        System.out.println(" ");
    } else if (choice.equals("3")) {
        personagesChoice = magician;
        list.add(personagesChoice);
        System.out.println("You Choose The " + magician.getName());
        System.out.println(" ");
        System.out.println("Stats Of This Character : ");
        System.out.println(magician);
        System.out.println(" ");
    } else if (choice.equals("4")) {
        personagesChoice = thief;
        list.add(personagesChoice);
        System.out.println("You Choose The " + thief.getName());
        System.out.println(" ");
        System.out.println("Stats Of This Character : ");
        System.out.println(thief);
        System.out.println(" ");
    } else {
        throw new Error();
    }
    return personagesChoice;
}

//SELECTION DU SECOND CHAMPION
static Player selectionSecondChampion(Player paysan, Player guerrier, Player magician, Player thief, ArrayList list){

    //CHOIX 2 CARACTERE
    System.out.println("""
                Choose Your Second Player :

                1 - Peasant ⚜️
                2 - Warrior ⚔️
                3 - Wizard ☄️
                4 - Thief ♠️
                """);
    Scanner scan = new Scanner(System.in);
    String secondChoice = scan.next();

    Player personnageSecond;

    if(secondChoice.equals("1")){
        personnageSecond = paysan;
        list.add(personnageSecond);
        System.out.println("You Choose The " + paysan.getName());
        System.out.println(" ");
        System.out.println("Stats Of This Character : ");
        System.out.println(paysan);
        System.out.println(" ");
    }else if(secondChoice.equals("2")){
        personnageSecond = guerrier;
        list.add(personnageSecond);
        System.out.println("You Choose The " + guerrier.getName());
        System.out.println(" ");
        System.out.println("Stats Of This Character : ");
        System.out.println(guerrier);
        System.out.println(" ");
    }else if(secondChoice.equals("3")) {
        personnageSecond = magician;
        list.add(personnageSecond);
        System.out.println("You Choose The " + magician.getName());
        System.out.println(" ");
        System.out.println("Stats Of This Character : ");
        System.out.println(magician);
        System.out.println(" ");
    }else if(secondChoice.equals("4")) {
        personnageSecond = thief;
        list.add(personnageSecond);
        System.out.println("You Choose The " + thief.getName());
        System.out.println(" ");
        System.out.println("Stats Of This Character : ");
        System.out.println(thief);
        System.out.println(" ");
    }else {
        throw new Error();
    }
    return personnageSecond;
}

//COMBAT
static void allGame(Player paysan, Player guerrier, Player magician, Player thief ,ArrayList list ,Player personagesChoice , Player personnageSecond){

    System.out.println(list);
    System.out.println("FIGHT :  " + personagesChoice.getName() + " VS " + personnageSecond.getName()+" : ");
    System.out.println(" ");
    System.out.println("""
                Start Fight ?

                1 - YES

                2 - NO

                3 - Delete A Character
                """);
    Scanner scan = new Scanner(System.in);
    String start = scan.next();



    if(start.equals("1")){

        //PHASE DE COMBAT
        while(personagesChoice.getHealth() >= 0 ){
            System.out.println(" ");
            int nombreDeTour = 1;
            if(personagesChoice.init > personnageSecond.init){
                //1 attack 2
                System.out.println("Tour numéro "+  nombreDeTour);
                System.out.println(" ");
                System.out.println("Player : " + personagesChoice.getName() + " attack enemy : " + personnageSecond.getName() + " and do - " + personagesChoice.getAttack()+ " damage");
                System.out.println("Player : " + personnageSecond.getName() + " received - " + personagesChoice.getAttack() + " damage ");
                System.out.println(personnageSecond.getName() + " : " + personnageSecond.getHealth() + " HP - " + personagesChoice.getAttack() + " = ");
                personnageSecond.damage(personagesChoice.getAttack());
                System.out.println("Player : " + personnageSecond.getName() + " have " + personnageSecond.getHealth()  + " HP");
                System.out.println(" ");

                //Condition Death
                if(personnageSecond.getHealth() <=0){
                    System.out.println(" ");
                    System.out.println("THE FIGHT IS OVER : " + personnageSecond.getName() + " is K.O");
                    System.out.println(" ");
                    System.out.println("THE WINNER IS : " + personagesChoice.getName());
                    System.out.println(" ");
                    break;
                }
                //2 attack 1
                System.out.println("Player : " + personnageSecond.getName() + " attack enemy : " + personagesChoice.getName() + "and do - " + personnageSecond.getAttack() + " damage");
                System.out.println("Player : " + personagesChoice.getName() + " received - " + personnageSecond.getAttack() + " damage");
                System.out.println(personagesChoice.getName() + " : " + personagesChoice.getHealth() + " HP - " + personnageSecond.getAttack() + " = ");
                personagesChoice.damage(personnageSecond.getAttack());
                System.out.println("Player : " + personagesChoice.getName() + " have " + personagesChoice.getHealth() + " HP");
                System.out.println(" ");

                nombreDeTour++;

                //Condition Death
                if(personagesChoice.getHealth() <= 0){
                    System.out.println(" ");
                    System.out.println("THE FIGHT IS OVER : " + personagesChoice.getName() + " is K.O");
                    System.out.println(" ");
                    System.out.println("THE WINNER IS : " + personnageSecond.getName());
                    System.out.println(" ");
                    break;
                }
            }else {
                //2 attack 1
                System.out.println(nombreDeTour);
                System.out.println(" ");
                System.out.println("Player : " + personnageSecond.getName() + " attack enemy : " + personagesChoice.getName() + " and do - " + personnageSecond.getAttack() + " damage");
                System.out.println("Player : " + personagesChoice.getName() + " received - " + personnageSecond.getAttack() + " damage");
                System.out.println(personagesChoice.getName() + " : " + personagesChoice.getHealth() + " HP - " + personnageSecond.getAttack() + " = ");
                personagesChoice.damage(personnageSecond.getAttack());
                System.out.println("Player : " + personagesChoice.getName() + " have "+personagesChoice.getHealth() +"HP");
                System.out.println(" ");

                //Condition Death
                if(personagesChoice.getHealth() <= 0){
                    System.out.println(" ");
                    System.out.println("THE FIGHT IS OVER : " + personagesChoice.getName() + " is K.O");
                    System.out.println(" ");
                    System.out.println("THE WINNER IS : " + personnageSecond.getName());
                    System.out.println(" ");
                    break;
                }
                //1 attack 2
                System.out.println("Player : " + personagesChoice.getName() + " attack enemy : " + personnageSecond.getName() + " and do - " + personagesChoice.getAttack()+ " damage");
                System.out.println("Player : " + personnageSecond.getName() + " received - " + personagesChoice.getAttack() + " damage ");
                System.out.println(personnageSecond.getName() + " : " + personnageSecond.getHealth() + " HP - " + personagesChoice.getAttack() + " = ");
                personnageSecond.damage(personagesChoice.getAttack());
                System.out.println("Player : " + personnageSecond.getName() + " have "+personnageSecond.getHealth()+ "HP");
                System.out.println(" ");

                nombreDeTour ++;
                //Condition Death
                if(personnageSecond.getHealth() <=0){
                    System.out.println(" ");
                    System.out.println("THE FIGHT IS OVER : " + personnageSecond.getName() + " is K.O");
                    System.out.println(" ");
                    System.out.println("THE WINNER IS : " + personagesChoice.getName());
                    System.out.println(" ");
                    break;
                }
            }

        }

    }else if(start.equals("3")){
        System.out.println("Choose Who Delete  : ");
        System.out.println(" ");
        System.out.println("Delete : " + personagesChoice.getName() + " - 1 :");
        System.out.println(" ");
        System.out.println("Delete : " + personnageSecond.getName()  + " - 2 :");
        String del = scan.next();

        if(del.equals("1")){
            list.remove(personagesChoice);
            System.out.println("You Deleted Player " + personagesChoice.getName());
            System.out.println(" ");
            System.out.println("Player : ");
            System.out.println(" ");
            System.out.println(personnageSecond.getName());
            System.out.println(list);
        }else if(del.equals("2")){
            list.remove(personnageSecond);
            System.out.println("You Deleted Player " + personnageSecond.getName());
            System.out.println(" ");
            System.out.println("Player : ");
            System.out.println(" ");
            System.out.println(personagesChoice.getName());
            System.out.println(list);
        }
        System.out.println(" ");
        System.out.println("Choice A New Player ? ");
        System.out.println(" ");
        System.out.println("yes / no ");
        String back = scan.next();

        if(back.equals("yes")){
            personnageSecond = selectionSecondChampion(paysan, guerrier, magician, thief , list);
        }
            thirdPartGame(personagesChoice, personnageSecond, list);
    }
}
//AUTRE PHASE DE COMBAT
    static void thirdPartGame(Player personagesChoice, Player personnageSecond, ArrayList list){

        System.out.println(list);
        System.out.println("You Choose : " + personagesChoice.getName() + " VS " + personnageSecond.getName()+" : ");
        System.out.println(" ");
        System.out.println("""
                Start Fight ?

                1 - YES

                2 - NO

                3 - Delete A Character
                """);
        Scanner scan = new Scanner(System.in);
        String next = scan.next();

        if(next.equals("1")){

            //PHASE DE COMBAT
            while(personagesChoice.getHealth() >= 0 ){
                System.out.println(" ");
                if(personagesChoice.init > personnageSecond.init){
                    //1 attack 2
                    System.out.println(" ");
                    System.out.println("Player : " + personagesChoice.getName() + " attack enemy : " + personnageSecond.getName() + " and do - " + personagesChoice.getAttack()+ " damage");
                    System.out.println("Player : " + personnageSecond.getName() + " received - " + personagesChoice.getAttack() + " damage ");
                    System.out.println(personnageSecond.getName() + " : " + personnageSecond.getHealth() + " HP - " + personagesChoice.getAttack() + " = ");
                    personnageSecond.damage(personagesChoice.getAttack());
                    System.out.println("Player : " + personnageSecond.getName() + " have " + personnageSecond.getHealth() + " HP");
                    System.out.println(" ");

                    //Condition Death
                    if(personnageSecond.getHealth() <=0){
                        System.out.println(" ");
                        System.out.println("THE FIGHT IS OVER : " + personnageSecond.getName() + " is K.O");
                        System.out.println(" ");
                        System.out.println("THE WINNER IS : " + personagesChoice.getName());
                        System.out.println(" ");
                        break;
                    }
                    //2 attack 1
                    System.out.println("Player : " + personnageSecond.getName() + " attack enemy : " + personagesChoice.getName() + "and do - " + personnageSecond.getAttack() + " damage");
                    System.out.println("Player : " + personagesChoice.getName() + " received - " + personnageSecond.getAttack() + " damage");
                    System.out.println(personagesChoice.getName() + " : " + personagesChoice.getHealth() + " HP - " + personnageSecond.getAttack() + " = ");
                    personagesChoice.damage(personnageSecond.getAttack());
                    System.out.println("Player : " + personagesChoice.getName() + " have " + personagesChoice.getHealth() + " HP");
                    System.out.println(" ");

                    //Condition Death
                    if(personagesChoice.getHealth() <= 0){
                        System.out.println(" ");
                        System.out.println("THE FIGHT IS OVER : " + personagesChoice.getName() + " is K.O");
                        System.out.println(" ");
                        System.out.println("THE WINNER IS : " + personnageSecond.getName());
                        System.out.println(" ");
                        break;
                    }
                }else {
                    //2 attack 1
                    System.out.println(" ");
                    System.out.println("Player : " + personnageSecond.getName() + " attack enemy : " + personagesChoice.getName() + " and do - " + personnageSecond.getAttack() + " damage");
                    System.out.println("Player : " + personagesChoice.getName() + " received - " + personnageSecond.getAttack() + " damage");
                    System.out.println(personagesChoice.getName() + " : " + personagesChoice.getHealth() + " HP - " + personnageSecond.getAttack() + " = ");
                    personagesChoice.damage(personnageSecond.getAttack());
                    System.out.println("Player : " + personagesChoice.getName() + " have " + personagesChoice.getHealth() + " HP");
                    System.out.println(" ");

                    //Condition Death
                    if(personagesChoice.getHealth() <= 0){
                        System.out.println(" ");
                        System.out.println("THE FIGHT IS OVER : " + personagesChoice.getName() + " is K.O");
                        System.out.println(" ");
                        System.out.println("THE WINNER IS : " + personnageSecond.getName());
                        System.out.println(" ");
                        break;
                    }
                    //1 attack 2
                    System.out.println("Player : " + personagesChoice.getName() + " attack enemy : " + personnageSecond.getName() + " and do - " + personagesChoice.getAttack()+ " damage");
                    System.out.println("Player : " + personnageSecond.getName() + " received - " + personagesChoice.getAttack() + " damage ");
                    System.out.println(personnageSecond.getName() + " : " + personnageSecond.getHealth() + " HP - " + personagesChoice.getAttack() + " = ");
                    personnageSecond.damage(personagesChoice.getAttack());
                    System.out.println("Player : " + personnageSecond.getName() + " have " + personnageSecond.getHealth() + " HP");
                    System.out.println(" ");

                    //Condition Death
                    if(personnageSecond.getHealth() <=0){
                        System.out.println(" ");
                        System.out.println("THE FIGHT IS OVER : " + personnageSecond.getName() + " is K.O");
                        System.out.println(" ");
                        System.out.println("THE WINNER IS : " + personagesChoice.getName());
                        System.out.println(" ");
                        break;
                    }
                }

            }

        }
    }

    public static void main(String[] args) {

        //Player 1
        Player paysan = new Player("Paysan", 20, 100, 3);


        //Player 2
        Player guerrier = new Player("Warrior", 60, 250, 10);


        //Player 3
        Player magician = new Player("Magician", 100, 180, 15);


        //Player 4
        Player thief = new Player("Thief", 100, 150, 20);


        ArrayList list = new ArrayList();


        Player personageChoice = selectionChampion(paysan, guerrier, magician, thief, list);
        Player personnageSeconde = selectionSecondChampion(paysan, guerrier, magician, thief, list);
        allGame(paysan, guerrier, magician, thief , list, personageChoice, personnageSeconde);

    }
}


