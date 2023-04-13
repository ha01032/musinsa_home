package com.example.musinsa.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.musinsa.model.Outfit;
import com.example.musinsa.model.Pants;
import com.example.musinsa.model.Top;


@Mapper
public interface ScrollMapper {
	
	
	List<Top> topList();
	List<Pants> pantsList();
	List<Outfit> outfitList();
	
	
	
}
