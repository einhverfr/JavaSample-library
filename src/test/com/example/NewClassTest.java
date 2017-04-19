package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Christopher Travers on 19/04/2017.
 */
public class NewClassTest {
    @Test
    public void defaultConstructor() throws Exception {
        NewClass sut = new NewClass();
        assertEquals(sut.getClass(), NewClass.class);
    }

}