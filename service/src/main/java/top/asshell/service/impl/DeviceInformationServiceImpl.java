package top.asshell.service.impl;


import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.asshell.common.Utils.ServiceUtils;
import top.asshell.common.result.Result;
import top.asshell.dao.DeviceInformationMapper;
import top.asshell.dto.DeviceInformationDTO;
import top.asshell.pojo.DeviceInformation;
import top.asshell.service.DeviceInformationService;


@Service
public class DeviceInformationServiceImpl  implements DeviceInformationService  {
    @Autowired
    private DeviceInformationMapper deviceInformationMapper;


    @Override
    public Result<PageInfo<DeviceInformation>> getList(DeviceInformationDTO dto) {
        return ServiceUtils.getList(dto,deviceInformationMapper);
    }

    @Override
    public Result update(DeviceInformation deviceInformation) {
        return ServiceUtils.update(deviceInformation,deviceInformationMapper);
    }

    @Override
    public Result del(Integer[] ids) {
        return ServiceUtils.delete(ids,deviceInformationMapper);
    }

    @Override
    public Result add(DeviceInformation deviceInformation) {
        return ServiceUtils.add(deviceInformation,deviceInformationMapper);
    }
}
