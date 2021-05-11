import org.testng.Assert;
import org.testng.annotations.Test;

public class Task_14Test {

    @Test
    public void test(){
        Assert.assertEquals(AbbreviateString_Task14.test("Рома ест груши и пьет пиво",5),"Ро..." );

    }
}
