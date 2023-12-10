package com.scs.projetoa3;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.scs.projetoa3.produto.ProdutoResource;

@SpringBootTest
class ProjetoA3ApplicationTests {

    @Autowired
    private ProdutoResource controller;

    @Test
    void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }
}
