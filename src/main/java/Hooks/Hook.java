package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {

    @Before
    public void beforeStep(){
        System.out.println("Before Step");
    }

    @After
    public void afterStep(){
        System.out.println("After Step");
    }
}
