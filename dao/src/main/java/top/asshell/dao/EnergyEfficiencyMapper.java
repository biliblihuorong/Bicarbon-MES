package top.asshell.dao;

import org.apache.ibatis.annotations.Mapper;
import top.asshell.common.Utils.MapperBase;
import top.asshell.dto.EnergyEfficiencyDTO;
import top.asshell.pojo.EnergyEfficiency;

import java.util.List;

@Mapper
public interface EnergyEfficiencyMapper extends MapperBase<EnergyEfficiency> {
    public List<EnergyEfficiency> getList(EnergyEfficiencyDTO efficiencyDTO);

    public Integer save(EnergyEfficiency energyEfficiency);

    public Integer remove(Integer id);

    public Integer update(EnergyEfficiency energyEfficiency);


}
