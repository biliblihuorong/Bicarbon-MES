package top.asshell.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class MaterialApplication {

    @ApiModelProperty("领料申请主键")
    private Integer id;
    @ApiModelProperty("领料单号")
    private String receiveNumber;
    @ApiModelProperty("计划排产主键")
    private Integer plannedProductionId;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @ApiModelProperty("领取时间")
    private Date receiveTime;
    @ApiModelProperty("申请人")
    private String applicant;
    @ApiModelProperty("申请时间")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date applicantTime;
    @ApiModelProperty("申请状态")
    private String applicantStatus;
    @ApiModelProperty("审核人")
    private String reviewed;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @ApiModelProperty("审核时间")
    private String reviewedTime;
    @ApiModelProperty("审核状态")
    private String reviewedStatus;
    @ApiModelProperty("审核意见")
    private String reviewedOpinion;

    @ApiModelProperty("计划排产")
    private PlannedProduction plannedProduction;
    @ApiModelProperty("领料申请下半部分生产计划明细")
    private List<MaterialApplicationMaterial> materialApplicationMaterials;
}
