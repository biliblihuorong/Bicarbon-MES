package top.asshell.service;

import com.github.pagehelper.PageInfo;
import top.asshell.common.result.Result;
import top.asshell.dto.ProjectMaintenanceDTO;
import top.asshell.pojo.ProjectMaintenance;


public interface ProjectMaintenanceService {

    Result<PageInfo<ProjectMaintenance>> getList (ProjectMaintenanceDTO maintenanceDTO);

    Result update(ProjectMaintenance maintenance);

    Result add(ProjectMaintenance projectMaintenance);

    Result delete(Integer ids []);
}
