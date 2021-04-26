import org.junit.Test;

public class HW14Test {

    @Test
    public void test() {
        "tevirp".equals(HW14.forTesting("privet"));
    }

    @Test
    public void emptyStrTest() {
        "".equals(HW14.forTesting(""));
    }

    @Test
    public void numberStrTest() {
        "1234".equals(HW14.forTesting("4321"));
    }

    @Test
    public void nullTest() {
        System.out.println("nullTest completed = " + HW14.forTesting(null));
    }

}
