package com.asja.corewall.controller;


import com.alibaba.fastjson.JSON;
import com.asja.corewall.common.CommonResult;
import com.asja.corewall.common.dto.PictureList;
import com.asja.corewall.entity.PictureInfo;
import com.asja.corewall.service.IPictureInfoService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("//picture-info")
public class PictureInfoController {

    @Autowired
    private IPictureInfoService pictureInfoService;


    @RequestMapping("/{choice}/{start}/{end}")
    public String getImageList(@PathVariable int choice,@PathVariable int start,@PathVariable int end){

        QueryWrapper<PictureInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderBy(choice==0,false,"views");
        queryWrapper.orderBy(choice==1,false,"favorites");
        queryWrapper.orderBy(choice==2,false,"upload_time");
        queryWrapper.orderBy(choice==3,false,"RAND()");
        queryWrapper.last("limit "+ start + ","+end);
        List<PictureInfo> list = pictureInfoService.list(queryWrapper);


        PictureList pictureList = new PictureList(pictureInfoService.count(),end-start>20?start+20:end+1,list);
        return JSON.toJSONString(CommonResult.success(pictureList));


    }

    @RequestMapping("/addviews/{id}")
    public String viewAdd(@PathVariable Integer id){
        QueryWrapper<PictureInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",id);
        PictureInfo one = pictureInfoService.getOne(queryWrapper);
        one.setViews(one.getViews()+1);
        pictureInfoService.updateById(one);
        return JSON.toJSONString(CommonResult.success(one));
    }

    @RequestMapping("/addstar/{id}")
    public String starAdd(@PathVariable Integer id){
        QueryWrapper<PictureInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",id);
        PictureInfo one = pictureInfoService.getOne(queryWrapper);
        one.setFavorites(one.getFavorites()+1);
        pictureInfoService.updateById(one);
        return JSON.toJSONString(CommonResult.success(one));

    }

}
