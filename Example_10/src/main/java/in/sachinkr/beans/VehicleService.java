package in.sachinkr.beans;

import in.sachinkr.beans.speaker.Speaker;
import in.sachinkr.beans.tyres.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {
    private Tyre tyre;
    private Speaker speaker;

    @Autowired
    public VehicleService(Tyre tyre,Speaker speaker){
        this.tyre = tyre;
        this.speaker = speaker;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }
}
