package absoft.wombat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeCheckerTest {

    @Test
    public void testAgedUserCanPlay(){
        AgeChecker ageChecker = new AgeChecker();
        Assert.assertTrue(ageChecker.canPlayGame(22),"Your age doesn't allow you to proceed to next step!");
    }

    @Test
    public void testThatTooYongUsersCanNotPlay(){
        AgeChecker ageChecker = new AgeChecker();
        Assert.assertTrue(ageChecker.canPlayGame(7),"Children under 18 not allowed to play game! If you are 18 years old, Welcome!");
    }

}
