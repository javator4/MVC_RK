package pl.sda.mvc;

import pl.sda.mvc.Controller.GiantController;
import pl.sda.mvc.Model.Fatigue;
import pl.sda.mvc.Model.GiantModel;
import pl.sda.mvc.Model.Health;
import pl.sda.mvc.Model.Noutrishment;
import pl.sda.mvc.View.GiantView;
import sun.management.GcInfoBuilder;


public class App {

    public static void main(String[] args) {


        GiantModel giantModel = new GiantModel(Health.HEALTHY, Fatigue.NOTTIRED, Noutrishment.HUNGRY);
        GiantModel giantModel1 = new GiantModel(Health.HEALTHY, Fatigue.NOTTIRED, Noutrishment.HUNGRY);
        GiantView giantView = new GiantView();

        GiantController controller = new GiantController(giantModel, giantView);
        GiantController controller1 = new GiantController(giantModel1,giantView);


        controller.updateView();
        controller.setHealth(Health.DEAD);
        controller.updateView();
        controller.setFatigue(Fatigue.SLEEPING);
        controller.updateView();
        controller.setNoutrishment(Noutrishment.NOTHUNGRY);
        controller.updateView();

        controller1.updateView();


    }

}
