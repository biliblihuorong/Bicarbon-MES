package top.asshell.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class MyTarget {

    @ApiModelProperty("主键")
    private Integer id;
    @ApiModelProperty("标的名称")
    private String targetName;
    @ApiModelProperty("投标结束时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date bidEndTime;
    @ApiModelProperty("状态")
    private String status;
}
