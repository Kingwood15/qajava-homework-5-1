import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/testLimitsData.csv"})

    public void shouldCalculateTestLimits(int leftLimit, int rightLimit, int expected) {

        SQRService service = new SQRService();

        int actual = service.numberSQRInTheRange(leftLimit, rightLimit);

        Assertions.assertEquals(expected, actual);
    }
}
