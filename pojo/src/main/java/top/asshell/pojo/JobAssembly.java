package top.asshell.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class JobAssembly {
    @ApiModelProperty(value = "主键", example = "1")
    private Integer id;

    @ApiModelProperty(value = "作业名称", example = "装配车身")
    private String jobName;

    @ApiModelProperty(value = "生产数量", example = "100")
    private Integer productionQuantity;

    @ApiModelProperty(value = "备注", example = "无")
    private String remark;

    @ApiModelProperty(value = "计划排产主键", example = "1")
    private Integer productionPlanId;

    @ApiModelProperty(value = "开始时间", example = "2023-05-12")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date startTime;

    @ApiModelProperty(value = "结束时间", example = "2023-05-15")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date endTime;

    @ApiModelProperty(value = "作业状态", example = "进行中")
    private String jobStatus;
    @ApiModelProperty(value = "计划排产")
    private PlannedProduction plannedProduction;
}
