package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceimpl implements CarService{
    @Autowired
    private CarDAO carDAO;

    @Override
    public List<Car> getListFromService(Integer carsNumber) {
        if (carsNumber == null || carsNumber >= 5) {
            return carDAO.getCarList();
        } else {
            return carDAO.getCarList().subList(0, carsNumber);
        }

    }
}
