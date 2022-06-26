package com.asja.corewall.controller;


import com.asja.corewall.common.CommonResult;
import com.asja.corewall.common.dto.CategoryList;
import com.asja.corewall.entity.Category;
import com.asja.corewall.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ASJA
 * @since 2022-06-25
 */
@RestController
@RequestMapping("//category")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @RequestMapping("/list")
    public CommonResult getCateGoryList(){
        CategoryList categoryList = new CategoryList<Category>(categoryService.list());
        return CommonResult.success(categoryList);
    }

}
