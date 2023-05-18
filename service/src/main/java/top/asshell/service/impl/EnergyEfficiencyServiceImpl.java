package top.asshell.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.asshell.common.result.Result;
import top.asshell.dao.EnergyEfficiencyMapper;
import top.asshell.dto.EnergyEfficiencyDTO;
import top.asshell.pojo.EnergyEfficiency;
import top.asshell.service.EnergyEfficiencyService;

import java.util.List;

@Service
public class EnergyEfficiencyServiceImpl implements EnergyEfficiencyService {

    @Autowired
    private EnergyEfficiencyMapper mapper;
    @Override
    public Result update(EnergyEfficiency energyEfficiency) {
        Integer update = mapper.update(energyEfficiency);
        if (update<0){
            return Result.error("失败");
        }
        return Result.success(update);
    }

    @Override
    public Result remove(List<Integer> ids) {
        Integer i=0;
        for (Integer id : ids) {
            i+=mapper.remove(id);
        }
        if (i<0){
            return Result.error("删除失败");
        }
        return Result.success(null,"一共删除了"+i+"数据");
    }

    @Override
    public Result add(EnergyEfficiency energyEfficiency) {
        Integer save = mapper.save(energyEfficiency);
        if (save<0){
            return Result.error("添加失败");
        }

        return Result.success(null,"成功");
    }

    @Override
    public Result<PageInfo<EnergyEfficiency>> getListEnergyEfficiency(EnergyEfficiencyDTO efficiencyDTO) {
        PageHelper.startPage(efficiencyDTO.getPageNum(),efficiencyDTO.getPageSize());
        List<EnergyEfficiency> list = mapper.getList(efficiencyDTO);
        PageInfo<EnergyEfficiency> energyEfficiencyPageInfo = new PageInfo<>(list);
        return Result.success(energyEfficiencyPageInfo);
    }
}
