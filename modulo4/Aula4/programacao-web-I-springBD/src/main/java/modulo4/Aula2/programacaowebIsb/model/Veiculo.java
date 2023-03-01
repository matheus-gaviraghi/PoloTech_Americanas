package modulo4.Aula2.programacaowebIsb.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity // Identificar que essa classe é uma Entidade do JPA
@Table(name = "tb_veiculo") // Identificar que é uma tabela
// OBS: não precisaria do (name = "tb_veiculo"), é só para mostrar
@Getter
@Setter
// o Lombock realiza a criação de todos os getters e setters assim
@NoArgsConstructor
@AllArgsConstructor
public class Veiculo {

    // Toda tabela precisa de um identificador
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // define que o ID é AI e unico
    private Long id;

    // Se quisermos definir um nome diferente para uma coluna, podemos usar o @Column(name="tb_placa") por exemplo.
    // Se não colocarmos a anotação @Column, automaticamente o Java já vai entender que é uma coluna e vai colocar o nome do atributo
    @Column(unique = true)
    private String placa;
    private String marca;
    private String modelo;
    private String tipo;
    private Boolean disponivel;

}
