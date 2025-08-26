package carrinho;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import produto.Produto;


public class CarrinhoTest {

    private Carrinho carrinho;
    private Produto produto1;
    private Produto produto2;

    @BeforeEach
    void setUp() {
        carrinho = new Carrinho();
        produto1 = new Produto("Produto 1", 10.0);
        produto2 = new Produto("Produto 2", 20.0);
    }

    @Test
    public void testeAdicionandoItem (){
        carrinho.addItem(produto1);
        assertEquals(1, carrinho.getQtdeItems());
        assertTrue(carrinho.getValorTotal() == 10.0);
    }

    @Test
    public void testeRemovendoItem (){
        carrinho.addItem(produto1);
        carrinho.esvazia();
        assertEquals(0, carrinho.getQtdeItems());
        assertTrue(carrinho.getValorTotal() == 0);
    }

    @Test
    public void SomaValorTotal(){
        carrinho.addItem(produto1);
        carrinho.addItem(produto2);
        assertTrue(carrinho.getValorTotal() == 30.0);
    }
}
