package br.com.cristiano.processador.links;

import java.util.Scanner;

import br.com.cristiano.processador.utils.ExtratorDeURL;

public class Main {

	public static void main(String[] args) {
		ExtratorDeURL itexto = new ExtratorDeURL();
		System.out.println("Cole seu texto aqui:");
		Scanner s = new Scanner(System.in);
		String texto = s.nextLine();
		s.close();
		System.out.println(itexto.extrairURL(texto));
	}

}
