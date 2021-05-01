package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOimpl implements CarDAO{

    private final List<Car> carlist;

    {
        carlist = new ArrayList<>();
        carlist.add(new Car("Lada Priora", "black", 2012));
        carlist.add(new Car("Lada Kalina", "white", 2010));
        carlist.add(new Car("Lada Granta", "green", 2008));
        carlist.add(new Car("Lada Vesta", "yellow", 2020));
        carlist.add(new Car("Lada Xray", "blue", 2019));
    }
    @Override
    public List<Car> getCarList() {
        return carlist;
    }
}
