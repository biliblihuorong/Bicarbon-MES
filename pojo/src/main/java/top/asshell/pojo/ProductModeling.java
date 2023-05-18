package top.asshell.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class ProductModeling {


    @ApiModelProperty("产品建模id")
    private Integer id;
    @ApiModelProperty("模型名称")
    private String modelingName;
    @ApiModelProperty("产品id")
    private Integer materialId;
    @ApiModelProperty("备注")
    private String ps;

    @ApiModelProperty("产品")
    private Material material;

    @ApiModelProperty("产品模型明细信息")
    private List<ProductModelingMaterial> productModelingMaterials;
}
