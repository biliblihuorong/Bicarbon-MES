package top.asshell.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("能效预警")
public class EnergyEfficiency {

    @ApiModelProperty("主键")
    private Integer id;
    @ApiModelProperty("监测点名称")
    private String name;
    @ApiModelProperty("监测点地址")
    private String add;
    @ApiModelProperty("实时功率")
    private Integer power;
    @ApiModelProperty("实时电压")
    private Integer voltage;
    @ApiModelProperty("状态")
    private Integer status;
    @ApiModelProperty("上报时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time;
    @ApiModelProperty("备注")
    private String ps;
}