package company.implementations;

import company.interfaces.Messenger;

import javax.annotation.processing.Messager;

public class EmailMessenger implements Messenger {
    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }
}
