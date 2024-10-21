package br.com.schoolify.shoolify.turmapai;

import br.com.schoolify.shoolify.turma.Turma;
import br.com.schoolify.shoolify.usuario.Usuario;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_turma_pai")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TurmaPai {

    private Long id;

    @ManyToMany
    private Set<Usuario> usuarios = new HashSet<>();

    @ManyToMany
    private Set<Turma> turmas = new HashSet<>();
}
