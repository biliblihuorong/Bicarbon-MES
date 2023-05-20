package top.asshell.dao;

import org.apache.ibatis.annotations.Mapper;
import top.asshell.dto.ProjectMaintenanceDTO;
import top.asshell.pojo.ProjectMaintenance;

import java.util.List;

@Mapper

public interface ProjectMaintenanceMapper {

    List<ProjectMaintenance> getList(ProjectMaintenanceDTO dto);

    Integer save(ProjectMaintenance projectMaintenance);

    Integer update(ProjectMaintenance projectMaintenance);

    Integer delete(Integer id);
}
