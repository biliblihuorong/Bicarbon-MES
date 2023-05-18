package top.asshell.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class ProductShipmentDetails {
    @ApiModelProperty(value = "产品承运单明细信息数据列表主键", example = "1")
    private Integer id;

    @ApiModelProperty(value = "物料", example = "轮胎")
    private String material;

    @ApiModelProperty(value = "生产批号", example = "20220508")
    private String productionBatch;

    @ApiModelProperty(value = "仓库", example = "A仓库")
    private String warehouse;

    @ApiModelProperty(value = "库区", example = "1号库区")
    private String storageArea;

    @ApiModelProperty(value = "库位", example = "A001")
    private String location;

    @ApiModelProperty(value = "发货数量", example = "100")
    private Integer shipmentQuantity;

    @ApiModelProperty(value = "移库时间", example = "2022-05-08")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date transferTime;

    @ApiModelProperty(value = "备注", example = "此次发货为紧急操作")
    private String remarks;

}
