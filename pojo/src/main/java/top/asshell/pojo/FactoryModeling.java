package top.asshell.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class FactoryModeling {

    @ApiModelProperty("主键")
    private Integer id;
    @ApiModelProperty("产品id")
    private Integer MaterialId;
    @ApiModelProperty("生产线名称")
    private String lineName;
    @ApiModelProperty("产品")
    private Material material;
}
