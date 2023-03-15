package in.sachinkr.beans.speaker;

import org.springframework.stereotype.Component;

@Component
public class SonySpeaker implements Speaker{
    @Override
    public void makeSound() {
        System.out.println("Sony Speaker is making sound!");
    }
}
