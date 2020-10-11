package mine.spring_study.hibernate.chapter02.containerelement.custom;

import javax.validation.valueextraction.ExtractedValue;
import javax.validation.valueextraction.ValueExtractor;

public class GearBoxValueExtractor implements ValueExtractor<GearBox<@ExtractedValue ?>> {

    @Override
    public void extractValues(GearBox<@ExtractedValue ?> gearBox, ValueReceiver valueReceiver) {
        valueReceiver.value(null, gearBox.getGear());
    }
}
