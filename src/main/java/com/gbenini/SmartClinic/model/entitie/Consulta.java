package com.gbenini.SmartClinic.model.entitie;

import com.gbenini.SmartClinic.model.enumerate.consultaStatusEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "tb_consultas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long consultaId;

    private LocalDate data;

    private LocalTime hora;

    private consultaStatusEnum status;

    private String observacoes;

    @ManyToOne
    @JoinColumn(name = "medico_id", referencedColumnName = "medicoId")
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "paciente_id", referencedColumnName = "pacienteId")
    private Paciente paciente;

}
