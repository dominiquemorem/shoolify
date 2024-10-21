package br.com.schoolify.shoolify.turma;

import br.com.schoolify.shoolify.discprofturma.DiscProfTurma;
import br.com.schoolify.shoolify.turmapai.TurmaPai;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_turma")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Turma {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String descricao;

    @ManyToMany
    private Set<DiscProfTurma> discProfTurmas = new HashSet<>();

    @ManyToMany
    private Set<TurmaPai> turmaPais = new HashSet<>();
}
