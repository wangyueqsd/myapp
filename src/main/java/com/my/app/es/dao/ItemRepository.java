package com.my.app.es.dao;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.my.app.es.Item;

public interface ItemRepository extends ElasticsearchRepository<Item, Long> {

}
