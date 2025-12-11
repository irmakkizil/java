package patterns.state; // Dikkat: Paket ismini yapına göre ayarladım
import model.Room;

public interface RoomState {
    void handleRequest(Room room);
    String getStatusName();
}