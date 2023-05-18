package top.asshell.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@ApiModel("计划生产")
public class ProductionPlan {

    @ApiModelProperty("主键")
    private Integer id;
    @ApiModelProperty("计划号")
    private String planNumber;
    @ApiModelProperty("项目")
    private String project;
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("交货日期")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date deliveryDate;
    @ApiModelProperty("申请人")
    private String applicant;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @ApiModelProperty("申请时间")
    private Date applicantDate;
    @ApiModelProperty("申请状态")
    private String applicantStatus;
    @ApiModelProperty("审核人")
    private String auditor;
    @ApiModelProperty("审核时间")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date examineDate;
    @ApiModelProperty("审核状态")
    private String examineStatus;
    @ApiModelProperty("备注")
    private String ps;
    @ApiModelProperty("审核意见")
    private String examineOpinion;
}
