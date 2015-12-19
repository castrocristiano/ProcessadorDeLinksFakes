package br.com.cristiano.processador.utils;

public class ExtratorDeURL {
	
	/**
	 * Extrai ada URL fake a verdadeira URL.
	 * @param texto
	 * @return
	 */
	public String extrairURL(String texto){
		String url = texto.substring(texto.indexOf("url=")).replace("url=", "");
		char[] textoChar = url.toCharArray();
		char[] out = new char[url.length()];
		int index = out.length -1;
		for(int i = 0; i < url.length(); i++){
			out[i] = textoChar[index--];
		}
		return new String(out);
	}
}
