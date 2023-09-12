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

    @Column(nullable = false, length = 50)
    private String itemName;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false, name = "number")
    private int stockNumber;

    // 상품 상세정보를 보면 동영상이나 이미지가 있는 경우가 있는데
    // 그럴경우 큰 데이터를 다루기 위해서 @Lob을 넣어준다.
    @Lob
    @Column(nullable = false)
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
