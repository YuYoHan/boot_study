package com.example.study01.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString
@NoArgsConstructor
public class ItemDTO {
    private Long id;
    private String itemName;
    private int price;
    private ItemSellStatus itemSellStatus;
    private int stockNumber;
    private String itemDetail;
    private LocalDateTime regTime;
    private LocalDateTime updateTime;

    @Builder
    public ItemDTO(Long id,
                      String itemName,
                      int price,
                      int stockNumber,
                      String itemDetail,
                      LocalDateTime regTime,
                      ItemSellStatus itemSellStatus,
                      LocalDateTime updateTime) {
        this.id = id;
        this.itemName = itemName;
        this.price = price;
        this.stockNumber = stockNumber;
        this.itemDetail = itemDetail;
        this.regTime = regTime;
        this.itemSellStatus = itemSellStatus;
        this.updateTime = updateTime;
    }
}
