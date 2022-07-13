package com.asja.corewall.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @Description
 * @Author ASJA
 * @Create 2022-07-12 21:59
 */
@AllArgsConstructor
@Data
public class TimeSliceList<T> {

    private List<T> timeSliceList;
}
