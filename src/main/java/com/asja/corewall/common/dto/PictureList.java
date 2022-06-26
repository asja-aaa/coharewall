package com.asja.corewall.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @Description
 * @Author ASJA
 * @Create 2022-06-25 18:29
 */

@AllArgsConstructor
@Data
public class PictureList<T> {

    private Integer length;

    private Integer nextStart;

    private List<T> list;

}
