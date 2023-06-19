package com.itb.inf2dm.comercio.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2dm.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
	List<Produto> listaDeProdutos = new ArrayList<Produto>();
	
	@GetMapping("/listar")
	public String listarProdutos() {
		Produto p1 = new Produto();
		p1.setId(20l);
		p1.setNome("Máquina de Lavar Brastemp 12 litros");
		p1.setCodigoBarras("HUKFEAHKIFBIHFUHF");
		p1.setPreco(3799.99);
		
	
		listaDeProdutos.add(p1);
		return "produtos";
	}
	
	@GetMapping("/novo-prod")
	public String novoProduto() {
		return "novo-prod";
	}
}