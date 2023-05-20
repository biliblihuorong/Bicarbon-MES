package top.asshell.controller;

import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.asshell.common.result.Result;
import top.asshell.dto.EnergyEfficiencyDTO;
import top.asshell.pojo.EnergyEfficiency;
import top.asshell.service.EnergyEfficiencyService;

import java.util.List;

@RestController
@Api(tags = "能效预警接口")
@RequestMapping("/energyEfficiency")
public class EnergyEfficiencyController {

    @Autowired
    private EnergyEfficiencyService efficiencyService;

    @ApiOperation("查询")
    @GetMapping("/getList")
    public Result<PageInfo<EnergyEfficiency>> getLis(EnergyEfficiencyDTO efficiencyDTO) {

        return efficiencyService.getListEnergyEfficiency(efficiencyDTO);
    }

    @ApiOperation("修改")
    @PutMapping("/update")
    public Result update(@RequestBody EnergyEfficiency energyEfficiency) {
        return efficiencyService.update(energyEfficiency);
    }

    @ApiOperation("删除")
    @DeleteMapping("/delete")
    public Result delete(@RequestBody Integer ids []) {
        return efficiencyService.remove(ids);
    }

    @ApiOperation("新增")
    @PostMapping("/add")
    public Result add(@RequestBody EnergyEfficiency energyEfficiency) {
        return efficiencyService.add(energyEfficiency);
    }

}
