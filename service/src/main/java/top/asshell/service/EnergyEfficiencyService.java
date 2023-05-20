package top.asshell.service;

import com.github.pagehelper.PageInfo;
import top.asshell.common.result.Result;
import top.asshell.dto.EnergyEfficiencyDTO;
import top.asshell.pojo.EnergyEfficiency;



public interface EnergyEfficiencyService {
    Result update(EnergyEfficiency energyEfficiency);

    Result remove(Integer ids []);

    Result add(EnergyEfficiency energyEfficiency);

    Result<PageInfo<EnergyEfficiency>> getListEnergyEfficiency(EnergyEfficiencyDTO efficiencyDTO);

}
