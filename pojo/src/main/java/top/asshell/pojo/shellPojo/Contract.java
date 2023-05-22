//package top.asshell.pojo.shellPojo;
//
//import com.fasterxml.jackson.annotation.JsonFormat;
//import io.swagger.annotations.ApiModelProperty;
//import lombok.Data;
//import org.springframework.format.annotation.DateTimeFormat;
//
//import java.util.Date;
//@Data
//public class Contract {
//    @ApiModelProperty(value = "主键")
//    private Integer id;
//
//    @ApiModelProperty(value = "编号")
//    private String number;
//
//    @ApiModelProperty(value = "合同编号")
//    private String contractNumber;
//
//    @ApiModelProperty(value = "订单编号")
//    private String orderNumber;
//
//    @ApiModelProperty(value = "业务员")
//    private String salesman;
//
//    @ApiModelProperty(value = "客户名称")
//    private String customerName;
//
//    @ApiModelProperty(value = "交货日期")
//    @JsonFormat(pattern = "yyyy-MM-dd")
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    private Date deliveryDate;
//
//    @ApiModelProperty(value = "送货方式")
//    private String deliveryMethod;
//
//    @ApiModelProperty(value = "合同金额")
//    private Double contractAmount;
//
//    @ApiModelProperty(value = "签订日期")
//    @JsonFormat(pattern = "yyyy-MM-dd")
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    private Date signingDate;
//
//    @ApiModelProperty(value = "申请人")
//    private String applicant;
//
//    @ApiModelProperty(value = "申请时间")
//    @JsonFormat(pattern = "yyyy-MM-dd")
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    private Date applyDate;
//
//    @ApiModelProperty(value = "申请状态")
//    private Integer applyStatus;
//
//    @ApiModelProperty(value = "审核人")
//    private String reviewer;
//
//    @ApiModelProperty(value = "审核时间")
//    @JsonFormat(pattern = "yyyy-MM-dd")
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    private Date reviewDate;
//
//    @ApiModelProperty(value = "审核状态")
//    private Integer reviewStatus;
//
//    @ApiModelProperty(value = "审核备注")
//    private String reviewComment;
//
//    // 省略 getter 和 setter 方法
//}
