package top.asshell.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class Bom {

    @ApiModelProperty("物料清单id")
    private Integer id;
    @ApiModelProperty("bom名称")
    private String bomName;
    @ApiModelProperty("描述")
    private String describe;
    @ApiModelProperty("产品模型id")
    private Integer productModelId;

    @ApiModelProperty("产品模型")
    private ProductModeling productModeling;

    @ApiModelProperty("bom单明细信息")
    private List<BomMaterial> bomMaterials;
}
