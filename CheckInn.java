import java.util.*; 
/**
 * CheckInn w collection of Rooms 
 *
 * @author AlianaYoon + Allison Dixon
 * @version 13 Nov 2022 
 */
public class CheckInn
{ 
    //private String innName;
    
    private int numRoom;  
    private Vector<Room> rooms = new Vector<Room>(); 
    
    private static int numQuestion = 0; 
    private static int currentQuestion = 0; 
    private static Vector<String> question = new Vector<String>(); 
    
    
    public CheckInn()
    {
        //innName = n;
        numRoom = 0; 
    }
    
    public int getNumRoom(){
        return numRoom; 
    }
    
    public Vector<Room> getAllRooms(){
        return rooms; 
    }
    
    public Room getRoom(int i){
        return rooms.get(i); 
    }
    
    public String getNextQuestion(){
        return question.get(currentQuestion); 
    }
    
    public String getQuestion(int x){
        return question.get(x); 
    }
    
    public int getCurrentQuestion(){
        return currentQuestion; 
    }
    
    public void updateCurrentQuestion(){
        currentQuestion++; 
    }
    
    public void addRoom(Room r){
        rooms.add(r); 
        numRoom++; 
    }
     
    public static void addQuestion(String q){
        question.add(q); 
        numQuestion++; 
    }
    
    public static void main (String[] args){ 
    }
}
