/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.wmacevoy.collections;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author wmacevoy
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.github.wmacevoy.collections.CustomerTest.class, com.github.wmacevoy.collections.MainTest.class, com.github.wmacevoy.collections.MarketTest.class, com.github.wmacevoy.collections.ItemsTest.class, com.github.wmacevoy.collections.ItemTest.class})
public class CollectionsSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
