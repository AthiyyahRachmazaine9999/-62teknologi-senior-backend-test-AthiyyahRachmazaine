package repository;

import entity.Item;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, VarcharJdbcType> {
}
