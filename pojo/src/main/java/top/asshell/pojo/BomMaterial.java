package top.asshell.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class BomMaterial {

    @ApiModelProperty("bom_material主键")
    private Integer id;
    @ApiModelProperty("bomid")
    private Integer bomId;
    @ApiModelProperty("数量")
    private Integer num;
    @ApiModelProperty("备注")
    private String ps;
    @ApiModelProperty("物料id")
    private Integer materialId;

    @ApiModelProperty("物料")
    private Material material;
}
