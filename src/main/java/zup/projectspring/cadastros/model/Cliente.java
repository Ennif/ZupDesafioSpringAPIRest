package zup.projectspring.cadastros.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Data
@Table(
        name = "tbl_cliente"
)
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    @Column (nullable = false)
    private String nome;

    @Column (length = 30,unique = true)
    private String email;

    @Column (length = 11,unique = true,nullable = false)
    private int cpf;

    @Column (nullable = false)
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date nascimento;

    @OneToMany(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name="clienteId")
    private List<Endereco> enderecos = new ArrayList<>();




}
