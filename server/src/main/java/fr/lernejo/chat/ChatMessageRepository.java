package fr.lernejo.chat;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ChatMessageRepository{

    List<String> messageList = new ArrayList<>(10);

    void addChatMessage(String message){
        if (messageList.size() >= 10)
        {
            messageList.remove(0);
            messageList.add(message);
        }
        else
        {
            messageList.add(message);
        }
    }

    List<String> getListMessages(){
        return messageList;
    }

}
