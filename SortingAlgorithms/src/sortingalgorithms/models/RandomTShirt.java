/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms.models;

import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author George.Pasparakis
 */
public class RandomTShirt extends Tshirt implements Comparator<RandomTShirt> {

    public RandomTShirt() {
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
    private String givenUsingPlainJava_whenGeneratingRandomStringUnbounded_thenCorrect() {
        byte[] array = new byte[6]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("US-ASCII"));
        return(generatedString);
    }

    @Override
    public int compare(RandomTShirt o1, RandomTShirt o2) {
        int result = -254;
        if((o1.getSize().ordinal() > o2.getSize().ordinal()) == true) {
            result = 1;
        }
        if((o1.getSize().ordinal() < o2.getSize().ordinal()) == true) {
            result = -1;
        }
        if((o1.getSize().ordinal() == o2.getSize().ordinal()) == true) {
            result = 0;
        }
        return(result);
    }

   
}
