package com.example.musinsa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import com.example.musinsa.mapper.ScrollMapper;
import com.example.musinsa.model.Outfit;
import com.example.musinsa.model.Pants;
import com.example.musinsa.model.Top;


@Transactional
@Service
public class ScrollServiceImpl implements ScrollService {
	
	@Autowired
	private ScrollMapper scrollMapper;	

	
	@Override
	public void getmusinsalist(ModelAndView mav) {
		List<Top> topList = null;
		List<Pants> pantsList = null;
		List<Outfit> outfitList = null;
		
		topList = scrollMapper.topList();
		pantsList = scrollMapper.pantsList();
		outfitList = scrollMapper.outfitList();
		
		mav.addObject("topList",topList);
		mav.addObject("pantsList",pantsList);
		mav.addObject("outfitList",outfitList);
		mav.setViewName("scroll");
	}


	
}
