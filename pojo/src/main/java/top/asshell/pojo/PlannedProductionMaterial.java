package top.asshell.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PlannedProductionMaterial {
    @ApiModelProperty("主键")
    private  Integer id;
    @ApiModelProperty("物料id")
    private  Integer materialId;
    @ApiModelProperty("备注")
    private  String ps;
    @ApiModelProperty("需求数量")
    private  Integer number;
    @ApiModelProperty("使用数量")
    private  Integer usedQuantity;
    @ApiModelProperty("剩余数量")
    private  Integer remainingQuantity;
    @ApiModelProperty("计划排产id")
    private Integer plannedProductionId;


    @ApiModelProperty("物料")
    private Material material;
}
