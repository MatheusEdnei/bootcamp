package com.project.bootcamp.mapper;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import java.util.stream.Collectors;
import com.project.bootcamp.model.dto.StockDTO;
import com.project.bootcamp.model.Stock;

@Component
public class StockMapper {

	public Stock toEntity(StockDTO dto) {
		Stock stock = new Stock();
		
		stock.setId(dto.getId());
		stock.setName(dto.getName());
		stock.setDate(dto.getDate());
		stock.setPrice(dto.getPrice());
		stock.setVariation(dto.getVariation());
		
		return stock;
	}

	public StockDTO toDto(Stock stock) {
		StockDTO dto = new StockDTO();
		
		dto.setId(stock.getId());
		dto.setName(stock.getName());
		dto.setDate(stock.getDate());
		dto.setPrice(stock.getPrice());
		dto.setVariation(stock.getVariation());
		
		return dto;
	}

	public List<StockDTO> toDto(List<Stock> listStock) {
		return listStock.stream().map(this::toDto).collect(Collectors.toList());
	}

	
	
}
