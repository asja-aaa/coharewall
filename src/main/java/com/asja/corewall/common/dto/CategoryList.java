package com.asja.corewall.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @Description
 * @Author ASJA
 * @Create 2022-06-25 19:29
 */
@AllArgsConstructor
@Data
public class CategoryList<T> {

    private List<T> categoryList;
}
