package zup.projectspring.cadastros.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;
import zup.projectspring.cadastros.model.Endereco;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Builder
public class ClientsDto {
    private Long id;

    private String name;

    private String email;

    private int cpf;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dNascimento;

    private List<Endereco> enderecos = new ArrayList<>();

}

