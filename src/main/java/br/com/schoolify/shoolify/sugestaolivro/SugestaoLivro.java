package br.com.schoolify.shoolify.sugestaolivro;

import br.com.schoolify.shoolify.discprofturma.DiscProfTurma;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_sugestao_livros")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SugestaoLivro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String nome;
    @NotNull
    private String capa;
    private String linkLivros;


    @ManyToOne
    @JoinColumn (name = "discprofturma_id")
    private DiscProfTurma discProfTurma;
}
