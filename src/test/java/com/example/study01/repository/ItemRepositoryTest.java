package com.example.study01.repository;

import com.example.study01.domain.ItemSellStatus;
import com.example.study01.entity.item.ItemEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;


@SpringBootTest
@Transactional
class ItemRepositoryTest {


    @Autowired
    private ItemRepository itemRepository;

    public void createItemList() {
        for (int i = 0; i < 10; i++) {
            ItemEntity item = ItemEntity.builder()
                    .itemName("테스트 상품" +i)
                    .price(10000 +i)
                    .itemDetail("테스트 상품 상세 설명" + i)
                    .itemSellStatus(ItemSellStatus.SELL)
                    .stockNumber(100)
                    .regTime(LocalDateTime.now())
                    .updateTime(LocalDateTime.now())
                    .build();

            itemRepository.save(item);
        }
    }

    @Test
    @DisplayName("상품명 조회 테스트")
    void findByItemTest() {
        this.createItemList();
        List<ItemEntity> itemList = itemRepository.findByItemName("테스트 상품1");
        for (ItemEntity item : itemList) {
            System.out.println(item.toString());
        }
    }

}