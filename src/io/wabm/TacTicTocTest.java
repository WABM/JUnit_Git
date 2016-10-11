package io.wabm;

import static org.junit.Assert.*;


import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

/**
 * Created by MainasuK on 2016-10-10.
 */
public class TacTicTocTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule();

    @Test
    public void testTacTicToc() {
        log.enableLog();

        TacFactory tac = null;
        TicFactory tic = null;
        TocFactory toc = null;

        tac.sayTac();
        tic.sayTic();
        toc.sayToc();

        assertEquals("tactictoc", log.getLog());
    }
}
