package in.sachinkr.beans.tyres;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class BirdgeStoneTyre implements Tyre{
    @Override
    public void rotate() {
        System.out.println("BridgeStone Tyre is rotating!");
    }

}
