package com.maksim2335.tacocloud.Repository;

import com.maksim2335.tacocloud.Model.TacoOrder;
import com.maksim2335.tacocloud.Model.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
    List<TacoOrder> findByDeliveryZip(String deliveryZip);
    List<TacoOrder> readOrdersByDeliveryZipAndPlacedAtBetween(
            String deliveryZip, Date startDate, Date endDate);
    List<TacoOrder> findByDeliveryNameAndDeliveryCityAllIgnoreCase(
            String deliveryName, String deliveryCity);
    List<TacoOrder> findByDeliveryCityOrderByDeliveryName(String city);

    List<TacoOrder> findByUserOrderByPlacedAtDesc(User user, Pageable pageable);

}
