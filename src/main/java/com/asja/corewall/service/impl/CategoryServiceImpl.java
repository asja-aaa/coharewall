package com.asja.corewall.service.impl;

import com.asja.corewall.entity.Category;
import com.asja.corewall.mapper.CategoryMapper;
import com.asja.corewall.service.ICategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ASJA
 * @since 2022-06-25
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
