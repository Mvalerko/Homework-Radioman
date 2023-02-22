package org.example;

public class Radio {
    private int numberCurrentStation;
    private int soundVolume;

    public int getNumberCurrentStation() {
        return numberCurrentStation;
    }

    public void setNumberCurrentStation(int newNumberCurrentStation) {
        if (newNumberCurrentStation < 0) {
            return;
        }
        if (newNumberCurrentStation > 9) {
            return;
        }
        numberCurrentStation = newNumberCurrentStation;
    }

    public void next () {
        if (numberCurrentStation == 9) {
            numberCurrentStation = 0;
            return;
        }
        numberCurrentStation++;

    }
    public void prev () {
        if (numberCurrentStation == 0) {
            numberCurrentStation = 9;
            return;
        }
        numberCurrentStation--;
    }

}

