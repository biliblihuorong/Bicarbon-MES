package top.asshell.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.asshell.common.result.Result;
import top.asshell.dao.DeviceInformationMapper;
import top.asshell.dto.DeviceInformationDTO;
import top.asshell.pojo.DeviceInformation;
import top.asshell.service.DataAcquisitionService;
import top.asshell.service.DeviceInformationService;

import java.util.List;

@Service
public class DeviceInformationServiceImpl implements DeviceInformationService {
    @Autowired
    private DeviceInformationMapper deviceInformationMapper;

    public Result<PageInfo<DeviceInformation>> getList(DeviceInformationDTO dto){
        PageHelper.startPage(dto.getPageNum(),dto.getPageSize());
        List<DeviceInformation> list = deviceInformationMapper.getList(dto);
        PageInfo<DeviceInformation> deviceInformationPageInfo = new PageInfo<>(list);
        return Result.success(deviceInformationPageInfo);

    }
}
