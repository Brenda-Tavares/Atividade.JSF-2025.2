package br.com.cadUser;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "Pessoa")
@SessionScoped
public class Pessoa {
	private String nome;
	private ArrayList<String> nomes = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<String> getNomes() {
		return nomes;
	}

	public String adicionarNome() {
		if (nome != null && !nome.trim().isEmpty()) {
			nomes.add(nome);
			nome = "";
		}
		return null;
	}
}
