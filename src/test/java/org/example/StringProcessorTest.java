package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class StringProcessorTest {

    @Test
    public void isStrongPassword() {
        StringProcessor obj = new StringProcessor();
        assertEquals(true, obj.isStrongPassword("1lS*"),"Password is not strong");
    }
    @Test
    public void calculateDigits() {
        StringProcessor obj=new StringProcessor();
        assertEquals(23,obj.calculateDigits("shdgjhsd 12ddg wejh23 23 "),"Wrong number of digits");
    }
    @Test
    public void calculateWords() {
        StringProcessor obj=new StringProcessor();
        assertEquals(4,obj.calculateWords("sh dwi we"),"Wrong number of words");
    }
}