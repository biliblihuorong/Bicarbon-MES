package top.asshell.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class QualityInspectionStandards {
    @ApiModelProperty(value = "主键", example = "1")
    private Integer id;

    @ApiModelProperty(value = "物料主键", example = "1")
    private Integer materialId;

    @ApiModelProperty(value = "检验项目", example = "外观检查")
    private String inspectionItem;

    @ApiModelProperty(value = "检验类型", example = "抽检")
    private String inspectionType;

    @ApiModelProperty(value = "标准值上限", example = "10.00")
    private Double upperLimit;

    @ApiModelProperty(value = "标准值下限", example = "1.00")
    private Double lowerLimit;

    @ApiModelProperty(value = "备注", example = "无")
    private String remark;


    @ApiModelProperty("物料")
    private Material material;
}
