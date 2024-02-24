package com.maksim2335.tacocloud.Repository;

import com.maksim2335.tacocloud.Model.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}
