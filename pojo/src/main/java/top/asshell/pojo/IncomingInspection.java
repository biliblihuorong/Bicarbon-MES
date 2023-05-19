package top.asshell.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class IncomingInspection {


    @ApiModelProperty("来料检验主键")
    private Integer id;
    @ApiModelProperty("流水号")
    private Integer serialNumber;
    @ApiModelProperty("领料申请主键")
    private Integer materialApplicationId;
    @ApiModelProperty("物料主键")
    private Integer materialId;
    @ApiModelProperty("备注")
    private String ps;
    @ApiModelProperty("需求数量")
    private Integer number;
    @ApiModelProperty("已领数量")
    private Integer receivedQuantity;
    @ApiModelProperty("检验数量")
    private Integer samplingQuantity;
    @ApiModelProperty("检验项")
    private String inspectionItems;
    @ApiModelProperty("标准值上限")
    private String upperLimit;
    @ApiModelProperty("标准值下限")
    private String lowerLimit;
    @ApiModelProperty("检验值")
    private String inspectionValue;
    @ApiModelProperty("检验结果")
    private String inspectionResults;
    @ApiModelProperty("检验人")
    private String inspector;
    @ApiModelProperty("检验时间")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date inspectionTime;

    @ApiModelProperty("物料")
    private Material material;
    @ApiModelProperty("领料申请")
    private MaterialApplication materialApplication;
}
