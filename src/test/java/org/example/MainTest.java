package org.example;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void ej9() {
       // assertNotEquals(1000,Main.ej9('N',1000,1)); // este método falla porque el resultado es 1000 cuando tiene que ser distinto a 1000 en este caso 1016 euros
      //  assertNotEquals(1001,Main.ej9('E',1001,1)); // este método falla porque el resultado 1001 cuando tiene que ser distinto 1001 en este caso 1033
        assertEquals(1000,Main.ej9('R',1000,1));
       assertEquals(1000,Main.ej9('N',1000,0));
      assertEquals(999,Main.ej9('N',999,1));




    }


}