package top.asshell.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class Information {

    @ApiModelProperty("企业信息主键")
    private String id;
    @ApiModelProperty("企业名称")
    private String enterpriseName;
    @ApiModelProperty("统一社会信用代码")
    private String uscc;
    @ApiModelProperty("公司注册地址")
    private String companyAddress;
    @ApiModelProperty("机构类型")
    private String organizationType;
    @ApiModelProperty("企业性质")
    private String enterpriseNature;
    @ApiModelProperty("创立日期")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date establishDate;
    @ApiModelProperty("法人")
    private String iegalPerson;
    @ApiModelProperty("法人身份证")
    private String idCard;
    @ApiModelProperty("单位联系地址")
    private String unitContactAddress;
    @ApiModelProperty("经营范围")
    private String businessScope;
    @ApiModelProperty("公司简介")
    private String companyProfile;
    @ApiModelProperty("营业职照扫描件")
    private String businessLicense;
    @ApiModelProperty("营业职照有效期")
    private String validityPeriodOfBusinessLicense;
    @ApiModelProperty("法人/负责人身份证扫描件")
    private String idCardImg;
    @ApiModelProperty("开户行")
    private String bank;
    @ApiModelProperty("银行账号")
    private String bankAccount;
    @ApiModelProperty("开户行地址")
    private String bankAddress;
    @ApiModelProperty("单位注册电话")
    private String registrationPhone;
    @ApiModelProperty("单位注册地址")
    private String registeredAddress;
    @ApiModelProperty("注册资本（万元）")
    private String registeredCapital;
    @ApiModelProperty("实缴资本")
    private String capital;
    @ApiModelProperty("开户许可证")
    private String accountOpeningPermit;
}
