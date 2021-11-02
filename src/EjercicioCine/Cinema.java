package EjercicioCine;

public class Cinema {
	
	RoomSynchronized room = new RoomSynchronized();
	
	public synchronized boolean requestSeat(RequestSeat requestSeat) {
		if (room.isTaken(requestSeat)) {
			return false;
		}
		return false;
	}

	public RoomSynchronized getRoom() {
		return room;
	}
}
