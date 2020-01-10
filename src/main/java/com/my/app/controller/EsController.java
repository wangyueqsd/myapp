package com.my.app.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my.app.es.Item;
import com.my.app.es.dao.ItemRepository;

@Controller
@RequestMapping("view")
public class EsController {
	
	@Autowired
    private ElasticsearchTemplate elasticsearchTemplate;
	
	@Resource
	private ItemRepository itemRepository;
	
	@GetMapping("saveIndex")
	@ResponseBody
	public void saveIndex() {
		elasticsearchTemplate.createIndex(Item.class);
	}
	
	@GetMapping("searchObject")
	@ResponseBody
	public Object searchIndex() {
		Optional<Item> it = itemRepository.findById(1L);
		Iterable<Item> list = this.itemRepository.findAll(Sort.by("price").ascending());

        for (Item item:list){
            System.out.println(item);
        }
        
        NativeSearchQueryBuilder queryBuilder = new NativeSearchQueryBuilder();
        queryBuilder.withQuery(QueryBuilders.matchQuery("title", "小米"));
        Page<Item> items = this.itemRepository.search(queryBuilder.build());
        // 总条数
	    long total = items.getTotalElements();
	    System.out.println("total = " + total);
	    for (Item item : items) {
	        System.out.println(item);
	    }
		return it;
	}
	
	@GetMapping("deleteIndex")
	@ResponseBody
	public Object deleteIndex() {
		elasticsearchTemplate.deleteIndex("item");
		return "SUCCESS";
	}
	
	@GetMapping("saveObject")
	@ResponseBody
	public Object saveObject() {
		Item item = new Item("1", "小小米手机7", " 手机", "小米", 34439.00, "http://image.baidu.com/13123.jpg");
		itemRepository.save(item);
		Item item2 = new Item("2", "小米", " 手机", "小米", 349.00, "http://image.baidu.com/13123.jpg");
		Item item3 = new Item("3", "手机7", " 手机", "小米", 3459.00, "http://image.baidu.com/13123.jpg");
		List<Item> list = new ArrayList<Item>();
		list.add(item2);
		list.add(item3);
		itemRepository.saveAll(list);
		return "SUCESS";
	}
}
