package EjercicioCine;

import java.util.ArrayList;

public enum Letter {
	a, b, c, d, e, f, g, h, i, j, k, l, m, n, o;
	
	public static Letter getRandom() {
		return values()[(int)(Math.random() * values().length)];
	}
	public static ArrayList<Letter> getLetter() {
		ArrayList<Letter> letras = new ArrayList<Letter>();
		for (int i = 0; i < values().length; i++) {
			letras.add(values()[i]);	
		}
		return letras;
	}
	
	
	
}
