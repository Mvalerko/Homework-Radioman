package org.example;

public class Radio {

    //Вносим поля в которых будет храниться информация о радиостанции и об уровне громкости звука
    private int numberCurrentStation;
    private int soundVolume;

    //Реализуем метод получения информации о номере текущей радиостанции

    public int getNumberCurrentStation() {
        return numberCurrentStation;
    }

    //Реализуем метод прямой установки номера текущей радиостанции (Всего эфир состоит из 10 станций)
    public void setNumberCurrentStation(int newNumberCurrentStation) {
        if (newNumberCurrentStation < 0) {
            return;
        }
        if (newNumberCurrentStation > 9) {
            return;
        }
        numberCurrentStation = newNumberCurrentStation;
    }

    //Реализуем метод переключения текущей радиостанции на следующую по счету

    public void next() {
        if (numberCurrentStation == 9) {
            numberCurrentStation = 0;
            return;
        }
        numberCurrentStation++;

    }
    //Реализуем метод переключения текущей радиостанции на предыдущую по счету
    public void prev() {
        if (numberCurrentStation == 0) {
            numberCurrentStation = 9;
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
        if (soundVolume == 10) {
            //soundVolume = 10;
            return;
        }
        soundVolume++;
    }
    //Реализуем метод уменьшения уровня звука на 1 единицу
    public void volumeMinus() {
        if (soundVolume == 0) {
            //soundVolume = 0;
            return;
        }
        soundVolume--;

    }
}

