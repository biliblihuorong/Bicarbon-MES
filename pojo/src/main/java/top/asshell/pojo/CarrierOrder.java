package top.asshell.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Data
@ApiModel("承运单号")
public class CarrierOrder {
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

    @ApiModelProperty(value = "审核日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date approved_date;
    @ApiModelProperty(value = "审核状态")
    private Integer status;
}
