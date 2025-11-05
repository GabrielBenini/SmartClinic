package com.gbenini.SmartClinic.model.entitie;

import com.gbenini.SmartClinic.model.enumerate.roleEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    private String username;

    private String password;

    private String email;

    @Enumerated(EnumType.STRING)
    private roleEnum role;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Medico medico;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Paciente paciente;

}
