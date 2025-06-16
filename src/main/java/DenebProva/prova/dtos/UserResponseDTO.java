package DenebProva.prova.dtos;

import DenebProva.prova.models.Role;
import lombok.Data;

@Data
public class UserResponseDTO {

    private Long id;
    private String name;
    private String email;
    private Role role;
}
