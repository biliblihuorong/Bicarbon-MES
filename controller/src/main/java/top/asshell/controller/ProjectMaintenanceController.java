package top.asshell.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.asshell.common.result.Result;
import top.asshell.dto.ProjectMaintenanceDTO;
import top.asshell.pojo.ProjectMaintenance;
import top.asshell.service.impl.ProjectMaintenanceServiceImpl;

@RestController
@RequestMapping("/projectMaintenance")
@Api("项目维护接口")
public class ProjectMaintenanceController {
    @Autowired
    private ProjectMaintenanceServiceImpl service;
    @ApiOperation("查询")
    @GetMapping("/getList")
    public Result getList(ProjectMaintenanceDTO maintenanceDTO){
        return service.getList(maintenanceDTO);
    }
    @ApiOperation("新增")
    @PostMapping("/add")
    public Result add(ProjectMaintenance projectMaintenance){
        return service.add(projectMaintenance);
    }
    @ApiOperation("更新")
    @PutMapping("/update")
    public Result update(ProjectMaintenance projectMaintenance){
        return service.update(projectMaintenance);
    }
    @ApiOperation("删除")
    @DeleteMapping("/delete")
    public Result delete(Integer ids []){
        return service.delete(ids);
    }

}
