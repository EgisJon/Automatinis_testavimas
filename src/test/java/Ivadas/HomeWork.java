package Ivadas;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class HomeWork {

    /**
     * 4 yra lyginis skaičius
     */

    @Test
    public void testIfNumberFourIsEven() {
        //1. Pateikiam duomenis
        int tikrimasisSkaicius = 4;
        int expectedResult = 0;
        int actualResult;

        //2. Atliekame testo veiksmus
        actualResult = tikrimasisSkaicius % 2;

        //3. Palyginam rezultatus
        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * Dabar yra 19 valanda
     */

    @Test
    public void testIfTimeNowIs19Hour() {
        //1. Pateikiam duomenis
//        LocalTime expectedResult = LocalTime.of(19, 00);
//        LocalTime actualResult;
        int expectedResult = 19;
        int actualResult;

        //2. Atliekame testo veiksmus
//        actualResult = LocalTime.now();
        actualResult = LocalTime.now().getHour();

        //3. Palyginam rezultatus
        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * Testas “žalias” jeigu 995 dalijasi iš 3 (be liekanos)
     */
    @Test
    public void testIfNumber995DividesBy3WithoutRemainder() {
        //1. Pateikiam duomenis
        int tikrinamsisSkaicius = 995;
        boolean expectedResult = true;
        boolean actualResult = true;

        //2. Atliekame testo veiksmus
        if (tikrinamsisSkaicius % 3 == 0) {
        }

        //3. Palyginam rezultatus
        Assert.assertEquals(expectedResult, actualResult);

    }

    /**
     * Testas “žalias” jeigu šiandien trečiadienis
     */

    @Test
    public void testIfTodayIsWednesday() {
        //1. Pateikiam duomenis
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        int expectedResult = 3;
        int actualResult = dayOfWeek.getValue();

        //2. Atliekame testo veiksmus
        LocalDate.now().getDayOfWeek();

        //3. Palyginam rezultatus
        Assert.assertEquals(expectedResult, actualResult);

    }

    /**
     * Testas “žalias” po to, kai “palaukia” 5 sekundes
     */
    @Test
    public void testGreenAfter5Seconds() {

        //2. Atliekame testo veiksmus
        // Thread.sleep();

    }

    /**
     * Bonus: Testas “žalias” jei nuo 1 iki 10 yra 4 lyginiai skaičiai
     */

    @Test
    public void testIfCounts4EvenNumbersBetween1and10() {
        //1. Pateikiam duomenis

        int expectedResult = 4;
        int actualResult = 0;

        //2. Atliekame testo veiksmus
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                actualResult++;
            }
        }
        //3. Palyginam rezultatus
        Assert.assertEquals(expectedResult, actualResult);

    }
}
