package com.doitwell.scratch.models;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserTest {
    
    @Test
    public void givenNumbers_whenAPlusB_thenReturnSum(){
        Integer a = 10;
        Integer b = 9;
        Integer result = User.sum(a,b);

        assertEquals(result,19,0.001);

    }
}
