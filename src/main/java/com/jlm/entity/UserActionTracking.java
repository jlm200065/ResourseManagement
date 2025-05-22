package com.resource.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户操作埋点表
 * </p>
 *
 * @author auto gen
 * @since 2025-05-22
 */
@Data
@EqualsAndHashCode(of = {"id"}, callSuper = false)
@ApiModel(value="UserActionTracking对象", description="用户操作埋点表")
public class UserActionTracking implements Serializable {


    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;


    @ApiModelProperty(value = "操作类型")
    private Integer operationType;


    @ApiModelProperty(value = "关联帖子id")
    private String postId;



}
