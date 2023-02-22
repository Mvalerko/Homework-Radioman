import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class RadioTest {
    @Test
    public void getNumberCurrentStationTest () {
        Radio receiver = new Radio();

        receiver.getNumberCurrentStation();

        int expected = 0;
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setNumberCurrentStationTest () {
        Radio receiver = new Radio();

        receiver.setNumberCurrentStation(11);

        int expected = 0;
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setNegativeNumberCurrentStationTest () {
        Radio receiver = new Radio();

        receiver.setNumberCurrentStation(-1);

        int expected = 0;
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setValidNumberCurrentStationTest () {
        Radio receiver = new Radio();

        receiver.setNumberCurrentStation(5);

        int expected = 5;
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setEdgeNumberCurrentStationTest () {
        Radio receiver = new Radio();

        receiver.setNumberCurrentStation(9);

        int expected = 9;
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setPreEdgeNumberCurrentStationTest () {
        Radio receiver = new Radio();

        receiver.setNumberCurrentStation(8);

        int expected = 8;
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setZeroNumberCurrentStationTest () {
        Radio receiver = new Radio();

        receiver.setNumberCurrentStation(0);

        int expected = 0;
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setPreZeroNumberCurrentStationTest () {
        Radio receiver = new Radio();

        receiver.setNumberCurrentStation(1);

        int expected = 1;
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextTestNine () {
        Radio receiver = new Radio();

        receiver.setNumberCurrentStation(9);
        receiver.next();

        int expected = 0;
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextTestValid () {
        Radio receiver = new Radio();

        receiver.setNumberCurrentStation(8);
        receiver.next();

        int expected = 9;
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevTestZero () {
        Radio receiver = new Radio();

        receiver.prev();

        int expected = 9;
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevTestValid () {
        Radio receiver = new Radio();

        receiver.setNumberCurrentStation(7);
        receiver.prev();

        int expected = 6;
        int actual = receiver.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}
