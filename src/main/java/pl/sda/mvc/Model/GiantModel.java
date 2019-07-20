package pl.sda.mvc.Model;

public class GiantModel {

    private Health health;
    private Fatigue fatigue;
    private Noutrishment noutrishment;

    public GiantModel(Health health, Fatigue fatigue, Noutrishment noutrishment) {
        this.health = health;
        this.fatigue = fatigue;
        this.noutrishment = noutrishment;
    }

    public Health getHealth() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    public Fatigue getFatigue() {
        return fatigue;
    }

    public void setFatigue(Fatigue fatigue) {
        this.fatigue = fatigue;
    }

    public Noutrishment getNoutrishment() {
        return noutrishment;
    }

    public void setNoutrishment(Noutrishment noutrishment) {
        this.noutrishment = noutrishment;
    }

    @Override
    public String toString() {
        return "GiantModel{" +
                "health=" + health +
                ", fatigue=" + fatigue +
                ", noutrishment=" + noutrishment +
                '}';
    }
}
