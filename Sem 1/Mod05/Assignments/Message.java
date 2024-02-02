public class Message{

     private int idLength;
     private String deviceID;
     private int msgLength;
     private String textMsg;

     public Message(String msg){
     //implementation not shown
     }

     public boolean isValid(){
        return ((deviceID.length() == idLength) && (textMsg.length() == msgLength));
     }

     public int wordCount(){
        String[] words = textMsg.split(" ");
        return words.length;
     }
}