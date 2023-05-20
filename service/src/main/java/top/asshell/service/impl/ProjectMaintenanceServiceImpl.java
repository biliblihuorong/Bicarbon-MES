package top.asshell.service.impl;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.asshell.common.Utils.ServiceUtils;
import top.asshell.common.result.Result;
import top.asshell.dao.ProjectMaintenanceMapper;
import top.asshell.dto.ProjectMaintenanceDTO;
import top.asshell.pojo.ProjectMaintenance;
import top.asshell.service.ProjectMaintenanceService;

@Service
public class ProjectMaintenanceServiceImpl implements ProjectMaintenanceService {
    @Autowired
    private ProjectMaintenanceMapper mapper;


    @Override
    public Result<PageInfo<ProjectMaintenance>> getList(ProjectMaintenanceDTO maintenanceDTO) {
        return ServiceUtils.getList(maintenanceDTO,mapper);
    }

    @Override
    public Result update(ProjectMaintenance maintenance) {
        return ServiceUtils.update(maintenance,mapper);
    }

    @Override
    public Result add(ProjectMaintenance projectMaintenance) {
        return ServiceUtils.add(projectMaintenance,mapper);
    }

    @Override
    public Result delete(Integer[] ids) {
        return ServiceUtils.delete(ids,mapper);
    }
}
