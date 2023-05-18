package top.asshell.dto;

import io.swagger.annotations.ApiModelProperty;

public class DataAcquisitionDTO {
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
