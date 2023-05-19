package top.asshell.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class ProductionCompletion {

    @ApiModelProperty("生产完工单主键")
    private Integer id;
    @ApiModelProperty("单号")
    private String order;
    @ApiModelProperty("生产计划id")
    private Integer productionPlanId;
    @ApiModelProperty("生产作业")
    private String productionOperation;
    @ApiModelProperty("产品id")
    private Integer materialId;
    @ApiModelProperty("完工日期")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date completionDate;
    @ApiModelProperty("生产数量")
    private Integer quantity;
    @ApiModelProperty("生产批号")
    private String batchNumber;
    @ApiModelProperty("状态 未入库、入库中、已入库、检验合格、检验未合格")
    private String status;


    @ApiModelProperty("生产计划")
    private ProductionPlan productionPlan;
    @ApiModelProperty("产品")
    private Material material;
}
