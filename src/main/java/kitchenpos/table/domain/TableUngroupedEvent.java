package kitchenpos.table.domain;

import java.util.List;

public class TableUngroupedEvent {

    private List<Long> orderTableIds;

    public TableUngroupedEvent(List<Long> orderTableIds) {
        this.orderTableIds = orderTableIds;
    }

    public List<Long> getOrderTableIds() {
        return orderTableIds;
    }
}
