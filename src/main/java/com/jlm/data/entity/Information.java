package com.jlm.data.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author auto gen
 * @since 2025-05-22
 */
@Data
@EqualsAndHashCode(of = {"id"}, callSuper = false)
@ApiModel(value="Information对象", description="")
public class Information implements Serializable {


    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    private String info;



}
