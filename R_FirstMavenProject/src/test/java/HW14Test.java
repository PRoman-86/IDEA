import org.junit.Test;
import org.testng.Assert;

public class HW14Test {

    @Test
    public void test() {
        Assert.assertEquals(HW14.reverseTest("privet"), "tevirp");
    }

    @Test
    public void emptyStrTest() {
        Assert.assertEquals(HW14.reverseTest(""), "");
    }

    @Test
    public void numberStrTest() {
        Assert.assertEquals(HW14.reverseTest("4321"), "1234");
    }

    @Test
    public void nullTest() {
        Assert.assertEquals(HW14.reverseTest(null), null);
    }

}
