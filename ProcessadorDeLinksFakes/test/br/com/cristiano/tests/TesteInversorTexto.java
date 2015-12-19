package br.com.cristiano.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.cristiano.processador.utils.ExtratorDeURL;

public class TesteInversorTexto {
	private static final String URL = "url=";
	private static final String CORRECT_TEXT = URL + "teste funciona";
	private static final String INVERSE_TEXT = "anoicnuf etset";
	private ExtratorDeURL inversor;

	@Before
	public void setUp() {
		inversor = new ExtratorDeURL();
	}

	@Test
	public void testURL() {
		Assert.assertEquals(INVERSE_TEXT, inversor.extrairURL(CORRECT_TEXT));
	}

	@Test(expected = StringIndexOutOfBoundsException.class)
	public void testNoURL() {
		inversor.extrairURL(INVERSE_TEXT);
	}

}
