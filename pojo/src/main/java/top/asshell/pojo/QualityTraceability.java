package top.asshell.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel( "质量追溯")
public class QualityTraceability {


    @ApiModelProperty("主键")
    private Integer id;
    @ApiModelProperty("流水号")
    private String serialNumber;
    @ApiModelProperty("计划编号")
    private String planNumber;
    @ApiModelProperty("完工单号")
    private String completionNumber;
    @ApiModelProperty("作业名称")
    private String jobName;
    @ApiModelProperty("产线名称")
    private String productionLineName;
    @ApiModelProperty("检验批次")
    private String inspectionBatch;
    @ApiModelProperty("产品名称")
    private String productName;
    @ApiModelProperty("生产日期")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date productionDate;
    @ApiModelProperty("检验项")
    private String inspectionItem;
    @ApiModelProperty("生产数量")
    private Integer productionQuantity;
    @ApiModelProperty("抽检数量")
    private Integer inspectionQuantity;
    @ApiModelProperty("检验结果")
    private String inspectionResult;
    @ApiModelProperty("检验人")
    private String inspector;
    @ApiModelProperty("检验时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date inspectionTime;


}
