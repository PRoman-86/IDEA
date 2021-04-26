import org.junit.Test;
import org.testng.Assert;

public class HW14Test {

    @Test
    public void test() {
        Assert.assertEquals(HW14.forTesting("privet"), "tevirp");
    }

    @Test
    public void emptyStrTest() {
        Assert.assertEquals(HW14.forTesting(""), "");
    }

    @Test
    public void numberStrTest() {
        Assert.assertEquals(HW14.forTesting("4321"), "1234");
    }

    @Test
    public void nullTest() {
        Assert.assertEquals(HW14.forTesting(null), null);
    }

}
