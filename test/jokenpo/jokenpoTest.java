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
        assertEquals(0, jokenpo.jogar(1, 1), "Papel vs Papel deveria empatar");
        assertEquals(0, jokenpo.jogar(2, 2), "Pedra vs Pedra deveria empatar");
        assertEquals(0, jokenpo.jogar(3, 3), "Tesoura vs Tesoura deveria empatar");
    }

    @Test
    public void jogador1Vence(){
        int jogador1 = 3;
        int jogador2 = 1;

        assertEquals(1, jokenpo.jogar(jogador1, jogador2));
    }

     @Test
    public void jogador2Vence(){
        int jogador1 = 3;
        int jogador2 = 2;

        assertEquals(2, jokenpo.jogar(jogador1, jogador2));
    }

    @Test
    public void entradaInvalida (){
        int jogador1= 4;
        int jogador2= 2;

        assertEquals(-1, jokenpo.jogar(jogador1, jogador2));
    }
}
