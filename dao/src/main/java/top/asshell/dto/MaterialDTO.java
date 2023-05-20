package top.asshell.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import top.asshell.common.Utils.PageHelperDTO;
import top.asshell.pojo.Material;

import java.math.BigDecimal;

@Data
public class MaterialDTO extends PageHelperDTO<Material> {
    @ApiModelProperty("主键")
    private Integer id;
    @ApiModelProperty("编码")
    private String code;
    @ApiModelProperty("模型名称")
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
