package br.com.ada.projetofinalprogramacaoweb.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_cliente")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String documentoId;
    private String nome;
    private String telefone;
    private String tipo;


}
