package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner saySomething = new Scanner(System.in);
        Camera camera = new Camera();
        boolean isQuit = false;
        String message;

        System.out.println("Hi! It's a super-cool camera. What you wanna do?" +
                "\nWrite 'take' for take a photo" +
                "\nWrite 'change' for change or insert a film" +
                "\nWrite 'move' for move a film" +
                "\nWrite 'exit' if you tired and wanna be a autotester not a photographer");

        while (!isQuit) {
            System.out.print("> ");
            message = saySomething.nextLine();
            message = message.toLowerCase();

            switch (message){
                case "take":
                    camera.takeShot();
                    break;
                case "change":
                    camera.changeFilm();
                    break;
                case "move":
                    camera.moveFilm();
                    break;
                case "exit":
                    isQuit = true;
                    break;
                default:
                    System.out.println("I don't know what you talking about. Try again");
                    break;
            }

        }
    }
}

