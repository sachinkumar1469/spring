package in.sachinkr.beans.tyres;

import org.springframework.stereotype.Component;

@Component
public class Michelin implements Tyre{
    @Override
    public void rotate() {
        System.out.println("Michelin Tyre is rotating!");
    }
}
