package com.maksim2335.tacocloud.Repository;

import com.maksim2335.tacocloud.Model.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}
