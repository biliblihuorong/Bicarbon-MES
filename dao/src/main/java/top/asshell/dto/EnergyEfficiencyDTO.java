package top.asshell.dto;

import lombok.Data;
import top.asshell.common.Utils.PageHelperDTO;
import top.asshell.pojo.EnergyEfficiency;

@Data
public class EnergyEfficiencyDTO extends PageHelperDTO<EnergyEfficiency> {
    private String name;
    private String add;
    private Integer status;
    private Integer pageNum;
    private Integer pageSize;
}
