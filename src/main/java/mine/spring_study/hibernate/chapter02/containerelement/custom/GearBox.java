package mine.spring_study.hibernate.chapter02.containerelement.custom;

public class GearBox<T extends Gear> {
    private final T gear;

    public GearBox(T gear) {
        this.gear = gear;
    }

    public Gear getGear() {
        return this.gear;
    }
}
