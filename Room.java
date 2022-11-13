import java.util.*; 
/**
 * Rooms of CheckInn
 *
 * @author AlianaYoon + Allison Dixon
 * @version 13 Nov 2022
 */
public class Room
{ 
    private String username; 
    private String roomName;
    private Vector<String> response;  
    private int numResponse;

    public Room(String n, String r)
    {
        username = n;
        roomName = r; 
        numResponse = 0; 
        response = new Vector<String>(); 
    }

    public String getUsername() {
        return username; 
    }

    public String getRoomName() {
        return roomName; 
    }

    public String getAllResponse() {
        return response.toString(); 
    }

    public String getResponse(int num) {
        return response.get(num-1); 
    }

    public void addResponse(String r)
    {
        response.add(numResponse, r); 
        numResponse++; 
    }

    public String toString(){
        String s = "Welcome to " + username + "'s room " + roomName + "!";  
        s += "\n" + username + " has answered " + numResponse + " question(s) :)"; 
        return s; 
    }
    
    public static void main (String[] args){ 
    }
}
