package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by lichen@daojia.com on 2017-6-9.
 */
@Component
public class MessagePrinter {

    final private MessageService service;


    @Autowired
    public MessagePrinter(MessageService service){
        this.service = service;
    }

    @PostConstruct
    public void printMessage(){
        System.out.println(this.service.getMessage());
    }
}
