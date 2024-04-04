package com.example.demo;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import org.springframework.data.annotation.Id;

@Container(containerName = "availabilityCache", autoScale = true, ru = "1000", partitionKeyPath = "/id")
public class AvailabilityCacheItem {

    @Id
    @GeneratedValue
    private String id;

    private String itemId;

    private String state;

    public AvailabilityCacheItem() {
    }

    public AvailabilityCacheItem(String id, String itemId, String state) {
        this.id = id;
        this.itemId = itemId;
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
