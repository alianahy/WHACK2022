import java.util.*; 
/**
 * Driver class for CheckInn & Room.
 *
 * @author AlianaYoon + Allison Dixon
 * @version 13 Nov 2022
 */
public class CheckInnDriver
{
    public static void main(String[] args){ 
        CheckInn cake = new CheckInn();
        CheckInn.addQuestion("How are you feeling today, really?");
        CheckInn.addQuestion("What good things happened today?");
        CheckInn.addQuestion("How much sleep did you get last night?");
        CheckInn.addQuestion("Is there anything weighing on you today?");
        
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("_________Adding Rooms_________");
        System.out.println("What is your name?");
        String userName1 = scan.nextLine(); 
        System.out.println("What would you like to name your room?");
        String roomName1 = scan.nextLine();
        Room room1 = new Room(userName1, roomName1);
        System.out.println("Here's your question for Day " + (cake.getCurrentQuestion()+1) + " : " + cake.getNextQuestion());
        String answer1 = scan.nextLine(); 
        room1.addResponse(answer1); 
        
        System.out.println();
        System.out.println("Room 2: ");
        System.out.println("What is your name?");
        String userName2 = scan.nextLine(); 
        System.out.println("What would you like to name your room?");
        String roomName2 = scan.nextLine();
        Room room2 = new Room(userName2, roomName2);
        System.out.println("Here's your question of the day : " + cake.getNextQuestion());
        String answer2 = scan.nextLine(); 
        room2.addResponse(answer2); 
        
        cake.addRoom(room1); 
        cake.addRoom(room2);
        
        System.out.println("_______________________________________________________________");
        
        System.out.println("Welcome to CheckInn!");
        System.out.println("Which room would you like to CheckInn to?");
        System.out.println(); 
        String request = scan.nextLine();
        
        boolean roomExists = false; 
        int requestIndex = -1; 
        for (int i=0; i<cake.getAllRooms().size(); i++){ 
            if (cake.getRoom(i).getRoomName().equalsIgnoreCase(request)){ 
                System.out.println("We found the room!"); 
                requestIndex = i; 
                roomExists = true;

                break;
            }
            else{
                System.out.println("There are no rooms with that name, try again :)");
                System.out.println("Enter in 'done' to stop trying"); 
                while (!roomExists){ 
                    request = scan.nextLine(); 
                    if(request.equalsIgnoreCase("done")){
                        break;
                    }
                    if (cake.getRoom(i).getRoomName().equalsIgnoreCase(request)){ 
                        requestIndex = i;
                        roomExists = true; 
                        break;
                    }  
                }
            }
        }
        
        if(roomExists && requestIndex != -1){ 
            System.out.println(cake.getRoom(requestIndex));
            System.out.println("Which question would you like to view?");
            int requestQuestion = scan.nextInt();
            System.out.println("Question " + (requestQuestion)
            + " : " + cake.getRoom(requestIndex).getResponse(requestQuestion));
        } 
    }
}
