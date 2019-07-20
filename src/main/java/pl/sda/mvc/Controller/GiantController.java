package pl.sda.mvc.Controller;

import pl.sda.mvc.Model.Fatigue;
import pl.sda.mvc.Model.GiantModel;
import pl.sda.mvc.Model.Health;
import pl.sda.mvc.Model.Noutrishment;
import pl.sda.mvc.View.GiantView;

public class GiantController {

    private GiantModel giant;
    private GiantView view;


    public GiantController(GiantModel giant, GiantView view) {
        this.giant = giant;
        this.view = view;
    }

    public void updateView() {

        this.view.displayGiant(giant);

    }


    public Health getHealth() {
        return null;
    }

    public void setHealth(Health health) {
        giant.setHealth(health);


    }

    public Fatigue getFatigue() {
        return null;
    }

    public void setFatigue(Fatigue fatigue) {
        giant.setFatigue(fatigue);
    }

    public Noutrishment getNoutrishment() {
        return null;
    }

    public void setNoutrishment(Noutrishment noutrishment) {
        giant.setNoutrishment(noutrishment);
    }
}
