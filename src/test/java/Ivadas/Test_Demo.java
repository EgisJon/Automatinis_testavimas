package Ivadas;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Demo {

    @Test
    public void testSumaRezultProviding2and2() {
        //1.Paterikiame duomenis
        int inputA = 2;
        int inputB = 2;
        int expectedRasult = 4;
        int actualResult;

        //2.Atliekame testo veiksmus

        actualResult = inputA + inputB;


        //3.Patikriname rezultaus

        Assert.assertEquals(actualResult, expectedRasult);

    }


    @Test
    public void testDemoAntras() {


        //1.Paterikiame duomenis
        int inputA = -1;

        int inputB = -1;
        int expectedRasult = -2;
        int actualResult;

        //2.Atliekame testo veiksmus

        actualResult = inputA + inputB;


        //3.Patikriname rezultaus

        Assert.assertTrue(
                expectedRasult == actualResult,
                String.format("Actual %s, Expect %s", actualResult, expectedRasult)
        );
    }

}
