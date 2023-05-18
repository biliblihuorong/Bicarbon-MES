package top.asshell.service;

import com.github.pagehelper.PageInfo;
import top.asshell.common.result.Result;
import top.asshell.dto.DeviceInformationDTO;
import top.asshell.pojo.DeviceInformation;

public interface DeviceInformationService {
    Result<PageInfo<DeviceInformation>> getList(DeviceInformationDTO dto);

    Result update(DeviceInformation deviceInformation);

    Result del (Integer ids []);

    Result add(DeviceInformation deviceInformation);
}
