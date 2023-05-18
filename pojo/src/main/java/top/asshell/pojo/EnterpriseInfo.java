package top.asshell.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class EnterpriseInfo {
    @ApiModelProperty(value = "主键", example = "1")
    private Integer id;

    @ApiModelProperty(value = "标的主键", example = "1")
    private Integer targetId;

    @ApiModelProperty(value = "企业名称", example = "ABC公司")
    private String enterpriseName;

    @ApiModelProperty(value = "统一社会信用代码", example = "12345678901234567X")
    private String unifiedSocialCreditCode;

    @ApiModelProperty(value = "公司注册地址", example = "广东省深圳市南山区")
    private String companyRegisteredAddress;

    @ApiModelProperty(value = "机构类型", example = "有限责任公司")
    private String institutionType;

    @ApiModelProperty(value = "企业性质", example = "民营企业")
    private String enterpriseNature;

    @ApiModelProperty(value = "成立日期", example = "2022-05-10")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date establishmentDate;

    @ApiModelProperty(value = "法人/负责人", example = "张三")
    private String legalPerson;

    @ApiModelProperty(value = "法人/负责人身份证", example = "440882199001010101")
    private String legalPersonIdCard;

    @ApiModelProperty(value = "单位联系地址", example = "广东省深圳市南山区")
    private String unitContactAddress;

    @ApiModelProperty(value = "经营范围", example = "电子产品销售")
    private String businessScope;

    @ApiModelProperty(value = "公司简介", example = "ABC公司是一家专业的电子产品销售公司")
    private String companyProfile;

    @ApiModelProperty(value = "营业执照扫描件", example = "营业执照扫描件路径")
    private String businessLicenseScan;

    @ApiModelProperty(value = "营业执照有效期", example = "2023-05-14")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date businessLicenseValidityPeriod;

    @ApiModelProperty(value = "法人/负责人身份证扫描件", example = "身份证扫描件路径")
    private String legalPersonIdCardScan;

    @ApiModelProperty(value = "开户行", example = "中国银行")
    private String bankName;

    @ApiModelProperty(value = "银行账号", example = "1234567890")
    private String bankAccountNumber;

    @ApiModelProperty(value = "开户行地址", example = "广东省深圳市南山区")
    private String bankAddress;

    @ApiModelProperty(value = "单位注册电话", example = "0755-12345678")
    private String unitRegisteredPhone;

    @ApiModelProperty(value = "单位注册地址", example = "广东省深圳市南山区")
    private String unitRegisteredAddress;

    @ApiModelProperty(value = "注册资本（万元）", example = "100")
    private Integer registeredCapital;

    @ApiModelProperty(value = "实缴资本", example = "100")
    private Integer paidInCapital;

    @ApiModelProperty(value = "开户许可证/基本户存款信息证", example = "许可证路径")
    private String accountPermit;

    @ApiModelProperty(value = "企业数据", example = "企业数据信息")
    private String enterpriseData;
}

