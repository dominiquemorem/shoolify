package br.com.schoolify.shoolify.disciplina;

import br.com.schoolify.shoolify.discprofturma.DiscProfTurma;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_disciplina")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Disciplina {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String nome;
    @NotNull
    private String imgUrl;

    @ManyToMany
    private Set<DiscProfTurma> discProfTurmas = new HashSet<>();
}
