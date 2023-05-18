package top.asshell.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class MaterialInventory {
    @ApiModelProperty(value = "主键", example = "1")
    private Integer id;

    @ApiModelProperty(value = "物料主键", example = "1")
    private Integer materialId;

    @ApiModelProperty(value = "仓库", example = "A仓库")
    private String warehouse;

    @ApiModelProperty(value = "总库存", example = "100")
    private Integer totalInventory;

    @ApiModelProperty(value = "锁定库存", example = "10")
    private Integer lockedInventory;

    @ApiModelProperty(value = "库存上限", example = "500")
    private Integer inventoryUpperLimit;

    @ApiModelProperty(value = "库存下限", example = "10")
    private Integer inventoryLowerLimit;

    @ApiModelProperty("物料")
    private Material material;
}
