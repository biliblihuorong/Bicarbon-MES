package top.asshell.service.impl;


import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.asshell.common.Utils.ServiceUtils;
import top.asshell.common.result.Result;
import top.asshell.dao.EnergyEfficiencyMapper;
import top.asshell.dto.EnergyEfficiencyDTO;
import top.asshell.pojo.EnergyEfficiency;
import top.asshell.service.EnergyEfficiencyService;



@Service
public class EnergyEfficiencyServiceImpl implements EnergyEfficiencyService {

    @Autowired
    private EnergyEfficiencyMapper mapper;


    @Override
    public Result update(EnergyEfficiency energyEfficiency) {
        return ServiceUtils.update(energyEfficiency,mapper);
    }

    @Override
    public Result remove(Integer ids []) {
        return ServiceUtils.delete(ids,mapper);
    }

    @Override
    public Result add(EnergyEfficiency energyEfficiency) {
        return ServiceUtils.add(energyEfficiency,mapper);
    }

    @Override
    public Result<PageInfo<EnergyEfficiency>> getListEnergyEfficiency(EnergyEfficiencyDTO efficiencyDTO) {
        return ServiceUtils.getList(efficiencyDTO,mapper);
    }
}
