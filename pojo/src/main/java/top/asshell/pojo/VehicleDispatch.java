package top.asshell.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel("车辆调度")
public class VehicleDispatch {
    @ApiModelProperty(value = "主键", example = "1")
    private Integer id;

    @ApiModelProperty(value = "承运单主键", example = "1")
    private Integer shipmentId;

    @ApiModelProperty(value = "承运单号", example = "000001")
    private String shipmentNo;

    @ApiModelProperty(value = "备注", example = "无")
    private String remark;


    @ApiModelProperty("承运单")
    private CarrierOrder carrierOrder;

    @ApiModelProperty("车辆调度明细列表")
    private List<VehicleDispatchDetails> vehicleDispatchDetails;
}
