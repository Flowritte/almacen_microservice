package com.es.ori.orders_service.Entities.Enums;

public enum OrderStatus {//estados de la orden se comuniucara y enviara al topic
    //atra vez del orderEvents
    PLACED,
    CANCELLED,
    SHIPPED,
    DELIVERED
}
