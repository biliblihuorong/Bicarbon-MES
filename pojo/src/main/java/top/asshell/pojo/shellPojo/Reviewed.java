package top.asshell.pojo.shellPojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("审核人类")
public class Reviewed {
    @ApiModelProperty("唯一id")
    private Integer id;
    @ApiModelProperty("名字")
    private String name;
}
