package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        list.add(new Excavator("Excavator_1", "black", 12));
        list.add(new Excavator("Excavator_2", "white", 13));
        list.add(new Excavator("Excavator_3", "gray", 14));
        return list;
    }
}