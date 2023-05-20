package top.asshell.dao;

import org.apache.ibatis.annotations.Mapper;
import top.asshell.common.Utils.MapperBase;
import top.asshell.dto.ProjectMaintenanceDTO;
import top.asshell.pojo.ProjectMaintenance;

import java.util.List;

@Mapper

public interface ProjectMaintenanceMapper extends MapperBase<ProjectMaintenance> {

    List<ProjectMaintenance> getList(ProjectMaintenanceDTO dto);

    Integer save(ProjectMaintenance projectMaintenance);

    Integer update(ProjectMaintenance projectMaintenance);

    Integer remove(Integer id);
}
