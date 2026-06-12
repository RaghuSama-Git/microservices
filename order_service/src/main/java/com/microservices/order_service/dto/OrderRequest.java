package com.microservices.order_service.dto;

import java.util.List;

public class OrderRequest {
    private List<OrderedItemsDto> orderedItemsDtoList;

    public List<OrderedItemsDto> getOrderedItemsDtoList() {
        return orderedItemsDtoList;
    }

    public void setOrderedItemsDtoList(List<OrderedItemsDto> orderedItemsDtoList) {
        this.orderedItemsDtoList = orderedItemsDtoList;
    }
}
