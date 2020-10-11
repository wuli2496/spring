package mine.spring_study.hibernate.chapter02.containerelement.custom;

public class Car {
    private GearBox<@MinTorque(100) Gear> gearBox;

    public void setGearBox(GearBox<Gear> gearBox) {
        this.gearBox = gearBox;
    }
}
