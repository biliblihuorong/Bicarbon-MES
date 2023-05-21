package top.asshell.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import top.asshell.common.Utils.PageHelperDTO;
import top.asshell.pojo.DataAcquisition;
@Data
public class DataAcquisitionDTO extends PageHelperDTO<DataAcquisition> {
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
