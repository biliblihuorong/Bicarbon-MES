package top.asshell.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@ApiModel("设备信息")
public class DeviceInformation {

    @ApiModelProperty("设备信息主键")
    private Integer id;
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("编码")
    private String code;
    @ApiModelProperty("型号")
    private String model;
    @ApiModelProperty("生产日期")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date produceDate;
    @ApiModelProperty("生产批号")
    private String productBatch;
    @ApiModelProperty("制造商")
    private String manufacturer;
    @ApiModelProperty("设备状态 空闲 使用中 故障")
    private String deviceStatus;
    @ApiModelProperty("备注")
    private String ps;
}
