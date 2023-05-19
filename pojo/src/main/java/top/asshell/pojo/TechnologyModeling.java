package top.asshell.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class TechnologyModeling {
    @ApiModelProperty("主键")
    private String id;
    @ApiModelProperty("工艺名称")
    private String name;
    @ApiModelProperty("产品id")
    private String productId;
    @ApiModelProperty("单位耗电")
    private String consumePower;
    @ApiModelProperty("备注")
    private String ps;
    @ApiModelProperty("描述")
    private String describe;
    private Material material;
}
