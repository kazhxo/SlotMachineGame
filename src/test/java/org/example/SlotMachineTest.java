package org.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SlotMachineTest {
    @Test

    public void testSpin(){

        int[] symbols1={1,2,3,4,5};
        int[] symbols2={6,7,8,9,10};
        int[] symbols3={11,12,13,14,15};

        Reel reel1= new Reel(symbols1);
        Reel reel2= new Reel(symbols2);
        Reel reel3= new Reel(symbols3);

        SlotMachine slotMachine= new SlotMachine(new Reel[]{reel1,reel2,reel3});

        String[] result = slotMachine.startSpinning();
        assertNotNull(result);
        assertEquals(3, result.length);
        for (String symbol : result) {
            assertTrue(symbol.matches("\\d+"), "Result should be a string representation of a number");
        }




    }
}
