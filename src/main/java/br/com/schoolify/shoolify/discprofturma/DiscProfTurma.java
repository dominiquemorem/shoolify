package br.com.schoolify.shoolify.discprofturma;

import br.com.schoolify.shoolify.atividade.Atividade;
import br.com.schoolify.shoolify.disciplina.Disciplina;
import br.com.schoolify.shoolify.sugestaolivro.SugestaoLivro;
import br.com.schoolify.shoolify.turma.Turma;
import br.com.schoolify.shoolify.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_discprofturma")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiscProfTurma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany (mappedBy = "discProfTurma")
    private List<SugestaoLivro> sugestaoLivros = new ArrayList<>();

    @OneToMany (mappedBy = "discProfTurma")
    private List<Atividade> atividades = new ArrayList<>();

    @ManyToOne
    @JoinColumn (name = "usuario_id")
    private Usuario usuario;

    @ManyToMany
    private Set<Turma> turmas = new HashSet<>();

    @ManyToMany
    private Set<Disciplina> disciplinas = new HashSet<>();

}
