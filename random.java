package com.company;

import java.util.Random;

public class random {

    static int generateRandom() {
        int max = Main.characters.length;
        int min = 1;
        Random random = new Random();
        int rand = random.nextInt(max - min) + min ;
        return rand;
    }

}
