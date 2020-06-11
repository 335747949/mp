package com.wy.mp.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author lanwei
 * @since 2020-06-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ProcurementParticulars对象", description="")
public class ProcurementParticulars implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "采购流水号")
    private String procurementSerialNumber;

    @ApiModelProperty(value = "采购品种数量")
    private Integer procurementVarietyNumber;

    @ApiModelProperty(value = "药店名称")
    private String drugstoreName;

    @ApiModelProperty(value = "采购人")
    private String username;

    @ApiModelProperty(value = "采购计划提交日期")
    private Date date;

    @ApiModelProperty(value = "0：已提交，1：待确认，2：带传输")
    private Integer status;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @ApiModelProperty(value = "标记乐观锁")
    private Integer version;

    private Integer deleted;


}
