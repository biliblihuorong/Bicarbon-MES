package top.asshell.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class QualityReport {


    @ApiModelProperty("质量报告主键")
    private Integer id;
    @ApiModelProperty("检验编号")
    private String inspectionNumber;
    @ApiModelProperty("计划编号")
    private String planNumber;
    @ApiModelProperty("完工单号")
    private String completionOrderNumber;
    @ApiModelProperty("作业名称")
    private String jobName;
    @ApiModelProperty("产线名称")
    private String productionLineName;
    @ApiModelProperty("检验批次")
    private String inspectionLot;
    @ApiModelProperty("产品名称")
    private String productName;
    @ApiModelProperty("生产日期")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date manufactureDate;
    @ApiModelProperty("检验项")
    private String inspectionItems;
    @ApiModelProperty("生产数量")
    private String quantity;
    @ApiModelProperty("抽检数量")
    private String samplingQuantity;
    @ApiModelProperty("检验人")
    private String inspector;
    @ApiModelProperty("合格数量")
    private String qualifiedQuantity;
    @ApiModelProperty("检验时间")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date inspectionTime;
}
