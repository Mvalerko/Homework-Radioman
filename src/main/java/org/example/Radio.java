package org.example;

public class Radio {


    //Вносим поля в которых будет храниться информация о количестве радиостанций в эфире,начальной и последней радиостанции,
    // текущей радиостанции и об уровне громкости звука
    private int totalNumberStation;
    private int startNumberStation = 0;
    private int endNumberStation;

    private int numberCurrentStation = startNumberStation;
    private int soundVolume;


    public Radio() {
        this.totalNumberStation = 10;

        this.endNumberStation = totalNumberStation - 1;


    }

    public Radio(int size) {
        this.totalNumberStation = size;

        this.endNumberStation = size - 1;
    }


    //Реализуем метод получения информации о номере текущей радиостанции

    public int getNumberCurrentStation() {
        return numberCurrentStation;
    }

    public int getStartNumberStation() {
        return startNumberStation;
    }

    public int getEndNumberStation() {
        return endNumberStation;
    }

    //Реализуем метод прямой установки номера текущей радиостанции (Всего эфир состоит из 10 станций)
    public void setNumberCurrentStation(int newNumberCurrentStation) {
        if (newNumberCurrentStation < startNumberStation) {
            return;
        }
        if (newNumberCurrentStation > endNumberStation) {
            return;
        }
        numberCurrentStation = newNumberCurrentStation;
    }

    //Реализуем метод переключения текущей радиостанции на следующую по счету

    public void next() {
        if (numberCurrentStation == endNumberStation) {
            numberCurrentStation = startNumberStation;
            return;
        }
        numberCurrentStation++;

    }

    //Реализуем метод переключения текущей радиостанции на предыдущую по счету
    public void prev() {
        if (numberCurrentStation == startNumberStation) {
            numberCurrentStation = endNumberStation;
            return;
        }
        numberCurrentStation--;
    }

    //Реализуем метод получения информации об уровне звука
    public int getSoundVolume() {
        return soundVolume;
    }

    /*public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            return;
        }
        if (newSoundVolume > 10) {
            return;
        }
        numberCurrentStation = newSoundVolume;
    }
     */

    //Реализуем метод увеличения уровня звука на 1 единицу
    public void volumePlus() {
        if (soundVolume == 100) {
            return;
        }
        soundVolume++;
    }

    //Реализуем метод уменьшения уровня звука на 1 единицу
    public void volumeMinus() {
        if (soundVolume == 0) {
            return;
        }
        soundVolume--;
    }
}

