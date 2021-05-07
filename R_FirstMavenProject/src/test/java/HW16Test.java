import org.testng.annotations.Test;
import org.testng.Assert;

public class HW16Test {

    @Test
    public void mailTest() throws InterruptedException {
        Assert.assertEquals(HW16.tenMinuteMailTest(), true, "test failed");
    }

}
