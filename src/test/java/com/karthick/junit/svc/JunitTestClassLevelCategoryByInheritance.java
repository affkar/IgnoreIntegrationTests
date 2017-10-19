package com.karthick.junit.svc;

import org.junit.Test;

/**
 * Created by karthick on 19/10/17.
 */
public class JunitTestClassLevelCategoryByInheritance extends JunitTestClassLevelCategory {

    @Test
    public void testSomething3(){
        System.out.println("JunitTestClassLevelCategoryByInheritance.testSomething3");
    }

    @Test
    public void testSomething4(){
        System.out.println("JunitTestClassLevelCategoryByInheritance.testSomething4");
    }

}
