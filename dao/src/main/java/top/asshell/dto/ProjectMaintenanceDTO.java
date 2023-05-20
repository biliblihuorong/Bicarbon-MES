package top.asshell.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
@Data
@ApiModel("项目维护接收类")
public class ProjectMaintenanceDTO {

    @ApiModelProperty("项目名")
    private String projectName;
    @ApiModelProperty("负责人")
    private String head;
    @ApiModelProperty("开始时间起始区间时间")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date startStartTime;
    @ApiModelProperty("开始时间结束区间时间")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date endStartTime;
    @ApiModelProperty("结束时间起始区间时间")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date startEndTime;
    @ApiModelProperty("结束时间结束区间时间")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date endEndTime;
    @ApiModelProperty("0正常 1挂起")
    private Integer status;
    @ApiModelProperty("项目介绍（图片）")
    private String introduce;
}
