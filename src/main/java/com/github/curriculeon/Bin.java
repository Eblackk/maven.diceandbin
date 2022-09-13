package com.github.curriculeon;

public class Bin {
    Integer faceValueToTrack;
    Integer numberOfOccurrences;
    public Bin(Integer faceValueToTrack) {
        this. faceValueToTrack = faceValueToTrack;
        this.numberOfOccurrences = 0;

    }

    Bin(Integer faceValueToTrack, Integer numberOfOccurrences) {
        this.faceValueToTrack = faceValueToTrack;
        this.numberOfOccurrences = numberOfOccurrences;
    }

    public Integer getFaceValueToTrack() {
        return this.faceValueToTrack;
    }

    public Integer getNumberOfOccurrences() {

        return this.numberOfOccurrences;
    }

    public void increment() {
        numberOfOccurrences = numberOfOccurrences + 1;
    }
}
