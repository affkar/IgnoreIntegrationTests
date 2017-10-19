package com.karthick.junit.svc;

import org.junit.Test;

/**
 * Created by karthick on 19/10/17.
 */
public class JunitTestClassLevelCategoryByInheritance2 extends JunitTestClassLevelCategory {

    @Test
    public void testSomething3(){
        System.out.println("JunitTestClassLevelCategoryByInheritance2.testSomething3");
    }

    @Test
    public void testSomething4(){
        System.out.println("JunitTestClassLevelCategoryByInheritance2.testSomething4");
    }

}
