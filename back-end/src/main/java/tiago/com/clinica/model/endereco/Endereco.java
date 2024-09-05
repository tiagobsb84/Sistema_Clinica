package tiago.com.clinica.model.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class Endereco {
    private String logradouro;
    private String número;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
}
