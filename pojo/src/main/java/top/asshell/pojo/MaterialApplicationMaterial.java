package top.asshell.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class MaterialApplicationMaterial {


    @ApiModelProperty("领料申请下半部分生产计划明细主键")
    private Integer id;
    @ApiModelProperty("领料申请主键")
    private Integer materialApplicationId;
    @ApiModelProperty("物料主键")
    private Integer materialId;
    @ApiModelProperty("需求数量")
    private Integer number;
    @ApiModelProperty("已领数量")
    private Integer receivedQuantity;
    @ApiModelProperty("备注")
    private String ps;

    private Material material;
}
