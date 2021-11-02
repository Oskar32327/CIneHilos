package EjercicioCine;

import java.util.HashMap;

public class RoomSynchronized {
	
	private int totalSeats=300;
	private int totalRows=15;
	private boolean taken = false;
	private HashMap<Letter, Row> seatMap;
	private Row row;
	
	
	public RoomSynchronized() {
		super();
		seatMap = new HashMap<Letter, Row>();
		row = new Row(totalRows);
	}

	public synchronized boolean takeSeat(RequestSeat requestSeat) {
		Seat seat = null;
		boolean bandera=false;
		taken = seat.isOccupied();
		if (!taken) {
			seat.setOccupied(true);
			notifyAll();
			bandera=true;
			totalSeats --;
		}
		return bandera;
	}
	
	public void fillRows() {
		for (int i = 0; i < totalSeats; i++) {
			seatMap.get(Letter.getLetter().get(i));
		}
		
	}

	public boolean isTaken(RequestSeat requestSeat){
		return taken;
	}

	public HashMap<Letter, Row> getSeatMap() {
		return seatMap;
	}

	public int getTotalSeats() {
		return totalSeats;
	}
	
	
	
	
	
}
