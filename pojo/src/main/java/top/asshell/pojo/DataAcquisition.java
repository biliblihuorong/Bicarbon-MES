package top.asshell.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("能耗数据")
public class DataAcquisition {
    @ApiModelProperty("能耗数据采集id")
    private String id;
    @ApiModelProperty("设备名称")
    private String deviceName;
    @ApiModelProperty("已产数量")
    private String quantityProduced;
    @ApiModelProperty("单位耗电")
    private String powerConsumption;
    @ApiModelProperty("总耗电")
    private String totalPowerConsumption;
    @ApiModelProperty("单位碳排放")
    private String carbonEmission;
    @ApiModelProperty("总碳排放")
    private String totalCarbonEmission;
}
