package one.digitalinnovation.parking.controller;

import one.digitalinnovation.parking.controller.dto.ParkingDTO;
import one.digitalinnovation.parking.model.Parking;
import one.digitalinnovation.parking.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/parking")
public class ParkingController {

    //@Autowired //Injeção de dependencia pelo construtor com o Autowired - nao se utiliza mais.
    //Padrão de injeção de dependencia POR CONSTRUTOR
    private final ParkingService parkingService;

    public ParkingController(ParkingService parkingService){
        this.parkingService = parkingService;
    }


    @GetMapping
    public List<ParkingDTO> findAll(){//NUNCA se expoe um objeto de dominio na api

        /*Criou o OBJETO - Ele apagou na aula VI -
        var parking = new Parking();
        parking.setColor("PRETO");
        parking.setLicense("AAA-4444");
        parking.setModel("COROLLA");
        parking.setState("RN");

        //Retorno da Lista
        return Arrays.asList(parking, parking);

         */

        return parkingService.findAll();

    }
}
