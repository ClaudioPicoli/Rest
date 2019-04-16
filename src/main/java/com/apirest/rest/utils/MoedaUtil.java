package com.apirest.rest.utils;

import java.text.NumberFormat;
import java.util.Locale;

public class MoedaUtil {
	
	public static float normalizaValor(float value) {
		Locale locale = new Locale("pt","BR");
		NumberFormat nf = NumberFormat.getInstance(locale);
		return Float.parseFloat(nf.format(value));
	}
}
