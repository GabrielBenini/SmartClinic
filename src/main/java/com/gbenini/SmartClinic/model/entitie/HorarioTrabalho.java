package com.gbenini.SmartClinic.model.entitie;

import com.gbenini.SmartClinic.model.enumerate.diaSemanaEnum;
import jakarta.persistence.*;
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long horarioTrabalhoId;

    private diaSemanaEnum diaSemana;

    private LocalTime horaInicio;

    private LocalTime horaFim;

    @ManyToOne
    @JoinColumn(name = "medico_id")
    private Medico medico;

}
