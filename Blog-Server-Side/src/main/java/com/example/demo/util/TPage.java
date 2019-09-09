package com.example.demo.util;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TPage<T> {

	private int number;
	private int size;
	private Sort sort;
	private int totalPages;
	private Long totalElements;
	private List<T> content;

	public void setStat(Page page, List<T> list) {
		this.number = page.getNumber();
		this.size = page.getSize();
		this.sort = page.getSort();
		this.totalPages = page.getTotalPages();
		this.totalElements = page.getTotalElements();
		this.content = list;
	}

}