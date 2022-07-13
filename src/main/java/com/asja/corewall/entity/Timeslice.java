package com.asja.corewall.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author ASJA
 * @since 2022-07-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Timeslice implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer cid;

    private String title;


}
