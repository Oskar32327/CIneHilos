package EjercicioCine;

import java.util.Random;
import java.util.ArrayList;

public class User extends Thread {
	Cinema cinema;
	private int id;


	public User(Cinema cinema, int id) {
		super();
		this.cinema = cinema;
		this.id=id;
	}
		@Override
		public void run() {
			super.run();
			boolean taken=false;
			ArrayList<RequestSeat> registro = new ArrayList<RequestSeat>();
			do {
				int randomSeat = new Random().nextInt(20);
				Letter randomLetter = Letter.getRandom();
				
				RequestSeat requestSeat = new RequestSeat(randomLetter,randomSeat);
				//TODO Aleatorio sin repeticiones
				taken = cinema.getRoom().takeSeat(requestSeat);
				
				registro.add(requestSeat);
				
				System.out.println("Asiento numero: "+ randomSeat+"Letra: "+randomLetter+"Asignado: "+taken);
			} while (!taken &&  cinema.getRoom().getTotalSeats()>0);			
		}
}
