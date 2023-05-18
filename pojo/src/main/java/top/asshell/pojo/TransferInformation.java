package top.asshell.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class TransferInformation{

    @ApiModelProperty(value = "主键", example = "1")
    private Integer id;

    @ApiModelProperty(value = "物料", example = "轮胎")
    private String material;

    @ApiModelProperty(value = "批号", example = "20220508")
    private String batchNumber;

    @ApiModelProperty(value = "源仓库", example = "A仓库")
    private String sourceWarehouse;

    @ApiModelProperty(value = "源库区", example = "1号库区")
    private String sourceStorageArea;

    @ApiModelProperty(value = "源库位", example = "A001")
    private String sourceLocation;

    @ApiModelProperty(value = "目标仓库", example = "B仓库")
    private String targetWarehouse;

    @ApiModelProperty(value = "目标库区", example = "2号库区")
    private String targetStorageArea;

    @ApiModelProperty(value = "目标库位", example = "B001")
    private String targetLocation;

    @ApiModelProperty(value = "移除数量", example = "100")
    private Integer quantityRemoved;

    @ApiModelProperty(value = "移库时间", example = "2022-05-08")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date transferTime;

    @ApiModelProperty(value = "执行人", example = "张三")
    private String executor;

    @ApiModelProperty(value = "移库原因", example = "库存不足")
    private String transferReason;

    @ApiModelProperty(value = "备注", example = "此次移库为紧急操作")
    private String remarks;
}
