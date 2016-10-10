package io.wabm;

/**
 * Created by MainasuK on 2016-10-10.
 */

public class CMKHello implements HelloFactory {

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

}
