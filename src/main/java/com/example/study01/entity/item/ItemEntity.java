package com.example.study01.entity.item;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
@ToString
@Getter
@NoArgsConstructor
public class ItemEntity {
    @Id @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    private String itemName;
    private int price;
    private int stockNumber;
    private String itemDetail;
    private LocalDateTime regTime;
    private LocalDateTime updateTime;

    @Builder
    public ItemEntity(Long id,
                      String itemName,
                      int price,
                      int stockNumber,
                      String itemDetail,
                      LocalDateTime regTime,
                      LocalDateTime updateTime) {
        this.id = id;
        this.itemName = itemName;
        this.price = price;
        this.stockNumber = stockNumber;
        this.itemDetail = itemDetail;
        this.regTime = regTime;
        this.updateTime = updateTime;
    }
}
