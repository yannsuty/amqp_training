package fr.lernejo.chat;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.amqp.rabbit.core.RabbitTemplate;

import java.util.Scanner;

@SpringBootApplication
public class Launcher {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Launcher.class);
        RabbitTemplate template = context.getBean(RabbitTemplate.class);
        Scanner scan = new Scanner(System.in);
        String choix;
        do {
            System.out.println("Input a message, we will sent it for you (q for quit)");
            choix = scan.nextLine();
            template.convertAndSend("","chat_messages",choix);
        } while (!choix.equals("q"));
    }
}
