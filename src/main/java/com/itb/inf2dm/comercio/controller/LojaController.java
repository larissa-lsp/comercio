package com.itb.inf2dm.comercio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2dm.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
	List<Produto> listaDeProdutos = new ArrayList<Produto>();
	
	@GetMapping("/listar")
	public String listarProdutos(Model model) {
		
		Produto p1 = new Produto();
		p1.setId(20l);
		p1.setDescricao("Máquina de Lavar Roupas");
		p1.setNome("Máquina de Lavar Brastemp 12 litros");
		p1.setCodigoBarras("HUKFEAHKIFBIHFUHF");
		p1.setPreco(3799.99);
		p1.setCodStatus(true);
		
		Produto p2 = new Produto();
		p2.setId(30l);
		p2.setDescricao("Geladeira 400 litros Electrolux");
		p2.setNome("Refrigerador Electrolux 400l");
		p2.setCodigoBarras("JHVASJHJGHCVJKF");
		p2.setPreco(4300.00);
		p2.setCodStatus(false);
		
		listaDeProdutos.add(p1);
		listaDeProdutos.add(p2);
		
		model.addAttribute("listaDeProdutos", listaDeProdutos);
		return "produtos";
	}
	
	@GetMapping("/novo-prod")
	public String novoProduto() {
		return "novo-prod";
	}
}