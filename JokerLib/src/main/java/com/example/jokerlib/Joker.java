package com.example.jokerlib;

import java.util.Random;

public class Joker {
    private String[] jokeArray;
    private Random random;

    public Joker() {
        jokeArray = new String[10];
        random = new Random();

        jokeArray[0] = "Q. What's the difference between a jeweler and a prison guard?\n" + "\n" + "A. A jeweler sells watches, and a prison guard watches cells!";

        jokeArray[1] = "Q: What do chemists' dogs do with their bones?\n" + "\n" + "A: They barium!\n" + "\n";

        jokeArray[2] = "Can a kangaroo jump higher than a house? \n" + "\n" + "Of course, a house doesn’t jump at all.\n";

        jokeArray[3] = "Q: Why was six scared of seven? \n" + "A: Because seven \"ate\" nine.";

        jokeArray[4] = "Q: Did you hear about the kidnapping at school? \n" + "A: It's okay. He woke up.";

        jokeArray[5] = "Q: Why couldn't the leopard play hide and seek? \n" + "A: Because he was always spotted.";

        jokeArray[6] = "Q: What is the difference between snowmen and snowwomen? \n" + "A: Snowballs.";

        jokeArray[7] = "Q: What starts with E, ends with E, and has only 1 letter in it? \n" + "A: Envelope.";

        jokeArray[8] = "Q: How do you count cows? \n" + "A: With a cowculator.";

        jokeArray[9] = "Q: Why did the can crusher quit his job? \n" + "A: Because it was soda pressing.";

    }

    public String getJoke() {
        return jokeArray[random.nextInt(jokeArray.length)];
    }


}

