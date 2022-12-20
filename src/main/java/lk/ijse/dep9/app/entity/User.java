package lk.ijse.dep9.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data@NoArgsConstructor@AllArgsConstructor
public class User implements SuperEntity {
    @Id
    private String password;
    @Column(nullable = false)
    private String username;
    @Column(name = "full_name",nullable = false)
    private String fullName;
}
