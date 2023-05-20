package top.asshell.common.Utils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("DTO父类")
@Data
public class PageHelperDTO <T> {
    @ApiModelProperty("第几个页面")
    private Integer pageNum;
    @ApiModelProperty("页面多少数据")
    private Integer pageSize;

}
