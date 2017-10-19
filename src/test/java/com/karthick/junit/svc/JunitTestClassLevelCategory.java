package com.karthick.junit.svc;

import com.karthick.junit.cat.intf.IntegrationTests;
import org.junit.experimental.categories.Category;

/**
 * Created by karthick on 19/10/17.
 */

@Category(IntegrationTests.class)
public class JunitTestClassLevelCategory {

    public void testSomething1(){
        System.out.println("JunitTestClassLevelCategory.testSomething1");
    }

    public void testSomething2(){
        System.out.println("JunitTestClassLevelCategory.testSomething2");
    }

}
