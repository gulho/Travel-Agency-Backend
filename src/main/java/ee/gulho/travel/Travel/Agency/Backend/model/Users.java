package ee.gulho.travel.Travel.Agency.Backend.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Users {
    @Id
    @Email
    private String email;
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private String password;
    private boolean enabled;
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Authorities> authorities = new ArrayList();
}
