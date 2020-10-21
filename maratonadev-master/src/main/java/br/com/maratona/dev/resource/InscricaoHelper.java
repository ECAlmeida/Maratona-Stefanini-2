package br.com.maratona.dev.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

public class InscricaoHelper {
	
	List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public void init() {
		pessoas.add(new Pessoa("Kleber",1));
		pessoas.add(new Pessoa("Marcus",2));
		pessoas.add(new Pessoa("Stag",3));
	}
	
	
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	
	public Pessoa findPessoa(Integer id) {
		init();
		for (Pessoa indice : pessoas) {
			if(indice.getMatricula().equals(id)) {
				return indice;
			}
		}
		return null;
	}
	
}
