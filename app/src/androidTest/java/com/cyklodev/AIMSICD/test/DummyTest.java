package com.cyklodev.AIMSICD.test;

import android.test.ActivityInstrumentationTestCase2;

import com.cyklodev.AIMSICD.AIMSICD;

/**
 * Created by toby on 2014/12/07.
 */
public class DummyTest extends ActivityInstrumentationTestCase2<AIMSICD> {

    public DummyTest() {
        super(AIMSICD.class);
    }

    public void testSomething() {
        try { Thread.sleep(1000); } catch (Exception e) {}
        assertTrue(true);
    }
}
