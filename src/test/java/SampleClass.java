
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Nested
@Timeout(3)
public class SampleClass {
    @Test
    void thisWillFailInThreeSeconds() throws InterruptedException {
        Thread.sleep(10_000);
    }

    @Test
    @Timeout(6)
    void thisWillFailInSixSecond() throws InterruptedException {
        Thread.sleep(10_000);
    }
}
