package com.github.curriculeon;

public class Bin {
    Integer faceValueToTrack;
    Integer numberOfOccurences;
    public Bin(Integer faceValueToTrack) {
        this. faceValueToTrack = faceValueToTrack;
        this.numberOfOccurences = 0;

    }

    Bin(Integer faceValueToTrack, Integer numberOfOccurrences) {
        this.faceValueToTrack = faceValueToTrack;
        this. numberOfOccurences = numberOfOccurrences;
    }

    public Integer getFaceValueToTrack() {
        return this.faceValueToTrack;
    }

    public Integer getNumberOfOccurrences() {

        return this.numberOfOccurences;
    }

    public void increment() {
        numberOfOccurences = numberOfOccurences + 1;
    }
}
