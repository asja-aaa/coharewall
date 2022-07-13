package com.asja.corewall.controller;


import com.alibaba.fastjson.JSON;
import com.asja.corewall.common.CommonResult;
import com.asja.corewall.common.dto.TimeSliceList;
import com.asja.corewall.entity.Timeslice;
import com.asja.corewall.service.ITimesliceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ASJA
 * @since 2022-07-12
 */
@RestController
@RequestMapping("//timeslice")
public class TimesliceController {

    @Autowired
    private ITimesliceService timesliceService;

    @RequestMapping("/list")
    public String getTimeSliceList(){
        TimeSliceList<Timeslice> timesliceTimeSliceList = new TimeSliceList<>(timesliceService.list());
        return JSON.toJSONString(CommonResult.success(timesliceTimeSliceList));

    }

}
