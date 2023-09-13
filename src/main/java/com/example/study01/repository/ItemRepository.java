package com.example.study01.repository;

import com.example.study01.entity.item.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntity, Long> {
    List<ItemEntity> findByItemName(String itemName);
}
