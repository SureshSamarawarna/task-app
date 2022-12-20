package lk.ijse.dep9.app.dto;

import com.sun.source.doctree.SerialDataTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data@NoArgsConstructor@AllArgsConstructor
public class UserDTO implements Serializable {
    private String fullName;
    private String username;
    private String password;
}
