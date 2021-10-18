package com.example.laclinica;

import com.example.laclinica.model.OdontologoDTO;
import com.example.laclinica.service.IOdontologoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class OdontologoServiceTest {

    @Autowired
    IOdontologoService odontologoService;

    @Test
    public void testGetOdontologos()
    {
        OdontologoDTO odontologo = new OdontologoDTO();
        odontologo.setNombre("Fulanito");
        odontologo.setApellido("Menganito");
        odontologo.setMatricula("123456");

        odontologoService.createOdontologo(odontologo);

        List<OdontologoDTO> odontologos = odontologoService.getAll();
        boolean resultado = odontologos.size() > 0;

        assertTrue(resultado);

    }
}
