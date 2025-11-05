package com.gbenini.SmartClinic.model.entitie;

import com.gbenini.SmartClinic.model.enumerate.diaSemanaEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Entity
@Table(name = "tb_horarios_trabalho")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HorarioTrabalho {

    private Long id;

    private diaSemanaEnum diaSemana;

    private LocalTime horaInicio;

    private LocalTime horaFim;

}
