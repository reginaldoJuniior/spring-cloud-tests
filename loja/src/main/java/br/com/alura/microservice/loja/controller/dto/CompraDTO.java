package br.com.alura.microservice.loja.controller.dto;

import java.util.List;

public class CompraDTO {

	private List<ItemDaCompraDTO> produtos;
	private EnderecoDTO endereco;
	
	public List<ItemDaCompraDTO> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<ItemDaCompraDTO> produtos) {
		this.produtos = produtos;
	}
	public EnderecoDTO getEndereco() {
		return endereco;
	}
	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}
	
	
}
