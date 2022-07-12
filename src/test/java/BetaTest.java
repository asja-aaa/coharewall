import org.junit.jupiter.api.Test;

import static com.asja.corewall.common.util.TImeUtil.*;

/**
 * @Description
 * @Author ASJA
 * @Create 2022-06-28 20:35
 */

public class BetaTest {


    @Test
    public void TimeTest(){

        String s = getTimeStringByLong(getTimeBeforeMonth());
        System.out.println(s);

    }
}
