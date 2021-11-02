package EjercicioCine;

import java.util.ArrayList;
import java.util.HashMap;


public class Row {
	
	HashMap<Position, Seat> seatMap = new HashMap<Position, Seat>();

	public Row(int cantidad) {
		super();
		fillSeat();
	}
	
	public HashMap<Position, Seat> fillSeat() {
		int totalSeats=300;
		for (int i = 0; i < totalSeats; i++) {
			
		}
		return seatMap;
	}

}
