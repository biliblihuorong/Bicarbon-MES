package top.asshell.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class MaterialType {

    @ApiModelProperty("主键")
    private Integer typeId;
    @ApiModelProperty("类型名字")
    private String name;
    @ApiModelProperty("父级id没有是0")
    private Integer parentId;

    @ApiModelProperty("子类")
    private List<MaterialType> materialTypes;
}
