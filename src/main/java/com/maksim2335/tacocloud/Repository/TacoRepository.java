package com.maksim2335.tacocloud.Repository;

import com.maksim2335.tacocloud.Model.Taco;
import com.maksim2335.tacocloud.Model.TacoOrder;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TacoRepository extends CrudRepository<Taco, Long> {
    List<TacoOrder> findAll(Pageable page);
}
