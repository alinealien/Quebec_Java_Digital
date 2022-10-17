package one.digitalinnovation.parking.controller;

import one.digitalinnovation.parking.model.Parking;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/parking")
public class ParkingController {

    @GetMapping
    public List<Parking> findAll(){

        //Criou o OBJETO
        var parking = new Parking();
        parking.setColor("PRETO");
        parking.setLicense("AAA-4444");
        parking.setModel("COROLLA");
        parking.setState("RN");

        //Retorno da Lista
        return Arrays.asList(parking, parking);

    }
}
