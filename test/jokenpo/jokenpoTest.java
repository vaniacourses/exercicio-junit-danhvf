package jokenpo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jokenpo.jokenpo;

public class jokenpoTest {

    @Test 
    public void empateTest(){
        int jogador1 = 1;
        int jogador2 = 1;
        
        assertTrue(jokenpo.jogar(jogador1, jogador2) == 0);
    }

    @Test
    public void jogador1Vence(){
        int jogador1 = 3;
        int jogador2 = 1;

        assertTrue(jokenpo.jogar(jogador1, jogador2) == 1);
    }

     @Test
    public void jogador2Vence(){
        int jogador1 = 3;
        int jogador2 = 2;

        assertTrue(jokenpo.jogar(jogador1, jogador2) == 2);
    }

    @Test
    public void entradaInvalida (){
        int jogador1= 4;
        int jogador2= 2;

        assertTrue(jokenpo.jogar(jogador1, jogador2) == -1);
    }
}
