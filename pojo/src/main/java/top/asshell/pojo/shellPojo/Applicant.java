package top.asshell.pojo.shellPojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("申请人类")
public class Applicant {
    @ApiModelProperty("唯一id")
    private Integer id;
    @ApiModelProperty("申请人名字")
    private String name;
}
