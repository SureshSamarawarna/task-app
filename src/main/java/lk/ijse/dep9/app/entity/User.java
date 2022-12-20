package lk.ijse.dep9.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Data@NoArgsConstructor@AllArgsConstructor
public class User implements SuperEntity {

    private String password;

    private String username;

    private String fullName;
}
