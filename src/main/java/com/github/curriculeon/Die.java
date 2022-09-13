package com.github.curriculeon;

import java.util.concurrent.ThreadLocalRandom;

public class Die {
    private Integer currentFaceValue;


    Integer numberOfFaces;

    public Die() {
        this(6);
    }

    public Die(Integer numberOfFaces) {
        this.numberOfFaces = numberOfFaces;
    }

    public void roll() {
        int min = 1;
        int max = numberOfFaces;
        int randomValue = ThreadLocalRandom.current().nextInt(min, max);
        this.currentFaceValue = randomValue;


    }

    public Integer getCurrentFaceValue() {
        return this.currentFaceValue;
    }

    public Integer getNumberOfFaces() {
        return this.numberOfFaces;
    }
}
