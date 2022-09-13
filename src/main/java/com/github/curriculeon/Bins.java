package com.github.curriculeon;

public class Bins {
    Integer minFaceValue;
    Integer maxFaceValue;
    Bin[] binArray;

    public Bins() {
        this(1,6);

    }

    public Bins(Integer minFaceValue, Integer maxFaceValue) {
        this.minFaceValue = minFaceValue;
        this.maxFaceValue = maxFaceValue;
        int numberOfBins = maxFaceValue - minFaceValue;
        this.binArray = new Bin[numberOfBins];
        int currentLoopNumber = 0;
        while (currentLoopNumber < numberOfBins) {
            int currentFaceValue = this.minFaceValue + currentLoopNumber;
            Bin newBin = new Bin(currentFaceValue);
            binArray[currentLoopNumber] = newBin;
            currentLoopNumber = currentLoopNumber + 1;
        }

    }


    public void incrementBin(Integer faceValueToIncrement) {
    }

    public Bin getBin(Integer faceValueOfBin) {
        int currentLoopNumber = 0;
        int lastLoopNumber = binArray.length;
        while (currentLoopNumber < lastLoopNumber ) {
            Bin currentBin = this.binArray[currentLoopNumber];
            int faceValue = currentBin.getFaceValueToTrack();
            if (faceValue == faceValueOfBin) {
                return currentBin;
            }


            currentLoopNumber = currentLoopNumber + 1;

        }



        return null;
    }

    public Bin[] getBins() {
        return null;
    }
}
