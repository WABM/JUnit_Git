package io.wabm;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

/**
 * Created by MainasuK on 2016-10-10.
 */
public class HelloFactoryTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule();

    @Test
    public void testHello() {
        log.enableLog();
        HelloFactory helloGenerator = new CMKHello();
        helloGenerator.sayHello();

        assertEquals("Hello\n", log.getLog());
    }

}
