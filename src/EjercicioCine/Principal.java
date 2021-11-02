package EjercicioCine;


public class Principal {

	public static void main(String[] args) {
		
		int usuariosTotales=500;
		Cinema cinema = new Cinema();
		
		for (int i = 0; i < 2; i++) {
			User usuarUser = new User(cinema,i);
			usuarUser.start();
			
		}
	}

}
