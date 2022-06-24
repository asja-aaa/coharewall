package com.asja.corewall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author ASJA
 * @since 2022-06-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PictureInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private Integer fromHaven;

    private String resolutionRatio;

    private String tageList;

    private String userName;

    private LocalDateTime uploadTime;

    private String category;

    private String size;

    private Integer views;

    private Integer favorites;

    private String description;

    private String fullImgUrlWallhaven;

    private String smallImgUrlWallhaven;


}
