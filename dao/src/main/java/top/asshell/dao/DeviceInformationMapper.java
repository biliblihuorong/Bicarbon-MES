package top.asshell.dao;

import org.apache.ibatis.annotations.Mapper;
import top.asshell.dto.DeviceInformationDTO;
import top.asshell.pojo.DeviceInformation;

import java.util.List;

@Mapper
public interface DeviceInformationMapper {

    List<DeviceInformation> getList(DeviceInformationDTO informationDTO);

    Integer save(DeviceInformation deviceInformation);

    Integer remove(Integer id);

    Integer update(DeviceInformation deviceInformation);

}
