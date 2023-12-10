package com.scs.projetos.produtopackage;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestProduto {

    @Test
    public void testProduto() {
        Integer identifier = 5;
        String nome = "Hey Jude";
        String banda = "Beatles";
        Produto produtoEncontrado = new Produto();
        produtoEncontrado.setId(5);
        produtoEncontrado.setNome("Hey Jude");
        produtoEncontrado.setBanda("Beatles");

        assertEquals(nome, produtoEncontrado.getNome());
        assertEquals(banda, produtoEncontrado.getBanda());
        assertEquals(identifier, produtoEncontrado.getId());
    }
}
