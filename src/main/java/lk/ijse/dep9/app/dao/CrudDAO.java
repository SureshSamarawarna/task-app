package lk.ijse.dep9.app.dao;

import lk.ijse.dep9.app.entity.SuperEntity;
import net.bytebuddy.implementation.bind.annotation.Super;

import javax.sql.rowset.serial.SerialArray;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface CrudDAO <T extends SuperEntity,ID extends Serializable> extends SuperDAO {

    T save(T t);

    void update(T t);

    void deleteById(ID pk);

    Optional<T> findById(ID pk);

    List<T> findAll();

    long count();

    boolean existsById(ID pk);

}
