package top.asshell.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class Inspection {

    @ApiModelProperty("产品检验主键")
    private Integer id;
    @ApiModelProperty("完工单号")
    private String completionOrder;
    @ApiModelProperty("检验标准")
    private String inspectionStandards;
    @ApiModelProperty("抽检数量")
    private String samplingQuantity;
    @ApiModelProperty("检验值")
    private String inspectionValue;
    @ApiModelProperty("检验结果包括合规和不合格")
    private String inspectionResults;
    @ApiModelProperty("备注")
    private String ps;
    @ApiModelProperty("流水号")
    private String serialNumber;
    @ApiModelProperty("计划编号")
    private String planNumber;
    @ApiModelProperty("作业名称")
    private String jobName;
    @ApiModelProperty("产品名称")
    private String materialName;
    @ApiModelProperty("检验批次")
    private String inspectionLot;
    @ApiModelProperty("生产日期")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date produceDate;
    @ApiModelProperty("检验项")
    private String inspectionItems;
    @ApiModelProperty("检验时间")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date inspectionTime;
    @ApiModelProperty("产线名称")
    private String productionLine;
    @ApiModelProperty("生产数量")
    private String quantity;
    @ApiModelProperty("阈值上限")
    private String upperLimit;
    @ApiModelProperty("阈值下限")
    private String lowerLimit;
    @ApiModelProperty("检验人")
    private String inspector;
}
