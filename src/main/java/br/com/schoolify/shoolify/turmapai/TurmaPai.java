package br.com.schoolify.shoolify.turmapai;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_turma_pai")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TurmaPai {

    private Long id;
}
