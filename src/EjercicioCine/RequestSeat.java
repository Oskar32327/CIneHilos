package EjercicioCine;

public class RequestSeat {
	public Letter row;
	public int seat;
	
	public RequestSeat(Letter randomLetter, int randomSeat) {
		this.row= randomLetter;
		this.seat=randomSeat;
	}

	public Letter getRow() {
		return row;
	}

	public void setRow(Letter row) {
		this.row = row;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	@Override
	public String toString() {
		return "RequestSeat [Fila=" + row + ", Asiento=" + seat + "]";
	}
	
	
}
