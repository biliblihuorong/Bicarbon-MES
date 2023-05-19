package top.asshell.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PlannedProduction {

    @ApiModelProperty("计划排产id")
    private Integer id;
    @ApiModelProperty("流水号")
    private String serialNumber;
    @ApiModelProperty("计划号")
    private String planNumber;
    @ApiModelProperty("产品id")
    private Integer materialId;
    @ApiModelProperty("bom_id")
    private Integer bomId;
    @ApiModelProperty("生产线id")
    private Integer lineId;
    @ApiModelProperty("工艺建模id")
    private Integer technologyId;
    @ApiModelProperty("项目id")
    private Integer projectMaintenanceId;
    @ApiModelProperty("待产数量")
    private Integer quantityToBeProduct;
    @ApiModelProperty("已产数量")
    private Integer quantityProduct;
    @ApiModelProperty("生产日期")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date produceDate;
    @ApiModelProperty("交货日期")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date deliveryDate;
    @ApiModelProperty("发布状态")
    private String status;
    @ApiModelProperty("领料状态")
    private String pickingStatus;
    @ApiModelProperty("备注")
    private String ps;

    @ApiModelProperty("产品")
    private Material material;
    @ApiModelProperty("bom")
    private Bom bom;
    @ApiModelProperty("工艺")
    private TechnologyModeling technologyModeling;
    @ApiModelProperty("项目")
    private ProjectMaintenance projectMaintenance;

    @ApiModelProperty("物料列表")
    private List<PlannedProductionMaterial> plannedProductionMaterials;
}
