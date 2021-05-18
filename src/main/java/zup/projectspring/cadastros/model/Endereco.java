package zup.projectspring.cadastros.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="tbl_endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (length = 30,nullable = false)
    private String bairro;
    @Column (length = 30,nullable = false)
    private String numero;
    @Column (length = 30,nullable = false)
    private String logradouro;
    @Column (length = 30,nullable = false)
    private String complemento;
    @Column (length = 30,nullable = false)
    private String cidade;
    @Column (length = 30,nullable = false)
    private String estado;
    @Column (length = 30,nullable = false)
    private String CEP;


    @Column (length = 30,nullable = false)
    private long clienteId;


}
