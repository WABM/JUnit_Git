package io.wabm;

import org.junit.Test;

/**
 * Created by Administrator on 2016/10/13 0013.
 */
public class AliceFactotyTest {
    public final SystemOutRule log = new SystemOutRule();

    @Test
    public void testHello() {
        log.enableLog();
        AliceFactory aliceFactory = new AliceHello();
        aliceFactory.sayName();

        assertEquals("Alice\n", log.getLog());
    }
}
