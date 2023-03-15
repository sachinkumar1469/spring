package in.sachinkr.beans.speaker;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class BoseSpeaker implements Speaker{
    @Override
    public void makeSound() {
        System.out.println("Bose Speaker is making sound!");
    }
}
