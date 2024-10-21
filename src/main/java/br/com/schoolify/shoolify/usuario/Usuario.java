package br.com.schoolify.shoolify.usuario;

import br.com.schoolify.shoolify.comentario.Comentario;
import br.com.schoolify.shoolify.discprofturma.DiscProfTurma;
import br.com.schoolify.shoolify.evento.Evento;
import br.com.schoolify.shoolify.tipousuario.TipoUsuario;
import br.com.schoolify.shoolify.turmapai.TurmaPai;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table (name = "tb_usuario")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String nome;
    @NotNull
    @Column(unique = true)
    private String email;
    @NotNull
    @Column(unique = true)
    private String telefone;
    @NotNull
    private String senha;


    @OneToMany (mappedBy = "usuario")
    private List<DiscProfTurma> discProfTurmas = new ArrayList<>();

    @OneToMany (mappedBy = "usuario")
    private List<Comentario> comentarios = new ArrayList<>();

    @OneToMany (mappedBy = "usuario")
    private List<Evento> eventos = new ArrayList<>();

    @ManyToOne
    @JoinColumn (name = "tipousuario_id")
    private TipoUsuario tipoUsuario;

    @ManyToMany
    private Set<TurmaPai> turmaPais = new HashSet<>();
}
