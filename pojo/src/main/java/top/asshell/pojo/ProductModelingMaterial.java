package top.asshell.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ProductModelingMaterial {
    @ApiModelProperty("产品建模物料表主键")
    private Integer id;
    @ApiModelProperty("物料id")
    private Integer materialId;
    @ApiModelProperty("对应产品建模id")
    private Integer productModelingId;
    @ApiModelProperty("备注")
    private String ps;

    @ApiModelProperty("物料")
    private Material material;
}
