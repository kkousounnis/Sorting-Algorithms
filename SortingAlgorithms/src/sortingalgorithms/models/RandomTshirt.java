/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms.models;

import sortingalgorithms.models.enums.Color;
import sortingalgorithms.models.enums.Size;
import sortingalgorithms.models.enums.Fabric;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author George.Pasparakis
 */
public class RandomTshirt extends Tshirt implements Comparator<RandomTshirt> {

    public RandomTshirt() {
        super();
        this.setName(givenUsingPlainJava_whenGeneratingRandomStringUnbounded_thenCorrect());
        this.setSize(Size.values()[getRandomNumber(0, 6)]);
        this.setColor(Color.values()[getRandomNumber(0, 6)]);
        this.setFabric(Fabric.values()[getRandomNumber(0, 6)]);
    }

    private int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    // https://www.baeldung.com/java-random-string
    public static String givenUsingPlainJava_whenGeneratingRandomStringUnbounded_thenCorrect() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return (generatedString);

    }

    @Override
    public int compare(RandomTshirt o1, RandomTshirt o2) {
        int result = -254;
        if ((o1.getSize().ordinal() > o2.getSize().ordinal()) == true) {
            result = 1;
        }
        if ((o1.getSize().ordinal() < o2.getSize().ordinal()) == true) {
            result = -1;
        }
        if ((o1.getSize().ordinal() == o2.getSize().ordinal()) == true) {
            result = 0;
        }
        return (result);
    }

}
