package top.asshell.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import top.asshell.common.Utils.PageHelperDTO;
import top.asshell.pojo.CarrierOrder;

import java.util.Date;
@Data
public class CarrierOrderDTO extends PageHelperDTO<CarrierOrder> {
    @ApiModelProperty(value = "主键", example = "1")
    private Integer id;

    @ApiModelProperty(value = "单据号", example = "DO20220509")
    private String documentNumber;

    @ApiModelProperty(value = "出库单号", example = "SO20220509")
    private String outboundOrderNumber;

    @ApiModelProperty(value = "发货单号", example = "DN20220509")
    private String shippingNumber;

    @ApiModelProperty(value = "客户", example = "ABC公司")
    private String customer;

    @ApiModelProperty(value = "收货地址", example = "广东省深圳市南山区")
    private String deliveryAddress;

    @ApiModelProperty(value = "联系人", example = "张三")
    private String contact;

    @ApiModelProperty(value = "联系电话", example = "13812345678")
    private String contactPhone;


    @ApiModelProperty(value = "承运人", example = "顺丰快递")
    private String carrier;

    @ApiModelProperty(value = "运输距离", example = "500.00")
    private String transportDistance;

    @ApiModelProperty(value = "申请人")
    private String applicant;

    @ApiModelProperty(value = "申请日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date approveDate;
    @ApiModelProperty(value = "申请状态", example = "0是未提交、1是待审核、2是已审核")
    private Integer approvedStatus;

    @ApiModelProperty("审核人")
    private String reviewed;
    @ApiModelProperty("审核日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date reviewDate;

    @ApiModelProperty(value = "审核状态")
    private Integer reviewedStatus;

    @ApiModelProperty(value = "查询时间起始区间")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "结束查询时间区间")
    private Date endTime;
    @ApiModelProperty(value = "审核意见")
    private String ps;

}
