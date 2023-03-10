package br.com.ada.projetofinalprogramacaoweb.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
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

    @NotEmpty(message = "Obrigatório o preenchimento do documento")
    @Column(unique = true)
    private String documentoId;
    private String nome;

    @Size(min = 11, max = 11, message = "Telefone deve conter 11 dígitos: DDD + número")
    private String telefone;
    private String tipo;


}
