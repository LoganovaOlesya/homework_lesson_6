package com.company;

public class Camera {

    boolean isEmpty;
    boolean isFilmMoved;
    int numberOfShot;
    int lastShot;

    Camera () {
        isEmpty = true;
        isFilmMoved = false;
        numberOfShot = 1;
        lastShot = 10;
    }

    void takeShot () {
        if (isFilmMoved && !isEmpty) {
            System.out.println("I just take a photo № " + numberOfShot + " \nOMFG please make a better photo");
            isFilmMoved = false;
        }
        else {
            System.out.println("Nope, I can't... maybe I'm out of film or I didn't move it");
        }
    }

    void moveFilm () {
        if (!isFilmMoved && numberOfShot < lastShot && !isEmpty) {
            isFilmMoved = true;
            numberOfShot++;
            System.out.println("I swear next photo will be better");
        }
        else {
            System.out.println("Nope, need try something else");
        }
    }

    void changeFilm () {
        if (!isEmpty && numberOfShot < lastShot){
            System.out.println("I can't - film doesn't end yet or there is no film");
        }
        else {
            numberOfShot = 1;
            isFilmMoved = true;
            isEmpty = false;
            System.out.println("Ok, now we can take a photo");
        }
    }
}

