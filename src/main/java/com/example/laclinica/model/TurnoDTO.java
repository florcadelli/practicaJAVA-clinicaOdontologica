package com.example.laclinica.model;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class TurnoDTO {

    private Long id;
    private Paciente paciente;
    private Odontologo odontologo;
    private Date date;
}
