package com.example.laclinica.service;

import com.example.laclinica.model.TurnoDTO;

import java.util.Collection;
import java.util.List;

public interface ITurnoService {

  TurnoDTO readTurno(Long id);
  void createTurno(TurnoDTO turnoDTO);
  List<TurnoDTO> getAll();
  TurnoDTO updateTurno (TurnoDTO turnoDTO);
  void deleteTurno (Long id);
}
