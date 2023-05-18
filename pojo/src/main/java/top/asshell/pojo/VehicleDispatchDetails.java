package top.asshell.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("车辆调度明细")
public class VehicleDispatchDetails {
    @ApiModelProperty(value = "主键", example = "1")
    private Integer id;

    @ApiModelProperty(value = "车辆调度主键", example = "1")
    private Integer vehicleDispatchId;

    @ApiModelProperty(value = "车牌号", example = "粤B12345")
    private String licensePlate;

    @ApiModelProperty(value = "驾驶员", example = "张三")
    private String driver;

    @ApiModelProperty(value = "联系电话", example = "13912345678")
    private String contactNumber;

    @ApiModelProperty(value = "载重", example = "1000")
    private Integer loadCapacity;
}
