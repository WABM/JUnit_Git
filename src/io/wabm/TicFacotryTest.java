package io.wabm;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

/**
 * Created by MFK on 2016-10-11.
 */
public class TicFacotryTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule();

    @Test
    public void testTic() {
        log.enableLog();
        TicFacotry Mrfucking = new MFKTic();
        Mrfucking.sayTic();

        assertEquals("Tic", log.getLog());
    }

}
