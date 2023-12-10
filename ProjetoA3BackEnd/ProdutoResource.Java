package com.scs.projetoa3.produto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoResource {

    @Autowired
    private ProdutoDaoService service;

    @GetMapping("/produtos")
    public List<Produto> retrieveAllProdutos() {
        return service.findAll();
    }

    @GetMapping("/produtos/{id}")
    public Produto retrieveOneProduto(@PathVariable Integer id) {
        return service.findone(id);
    }
}
