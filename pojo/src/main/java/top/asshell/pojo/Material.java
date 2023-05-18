package top.asshell.pojo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Material {

    @ApiModelProperty("主键")
    private Integer id;
    @ApiModelProperty("编码")
    private String code;
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("型号")
    private String model;
    @ApiModelProperty("规格")
    private String specifications;
    @ApiModelProperty("单位")
    private String unit;
    @ApiModelProperty("单价")
    private BigDecimal price;
    @ApiModelProperty("类型id")
    private Integer typeId;
    @ApiModelProperty("备注")
    private String ps;
}
