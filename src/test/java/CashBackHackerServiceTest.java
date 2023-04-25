import org.junit.Assert;
import org.junit.Test;
import ru.netology.service.CashBackHackerService;

public class CashBackHackerServiceTest {
    CashBackHackerService service = new CashBackHackerService();
    @Test
    public void calcRemainIfAmountUnderBoundary() {
        int amount = 500;

        int expected = 500;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void calcRemainIfAmountOverBoundary() {
        int amount = 1500;

        int expected = 500;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calcRemainIfAmountEqualToBoundary() {
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calcRemainIfAmountEqualToZero() {
        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

}

