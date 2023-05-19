package top.asshell.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.asshell.common.result.Result;
import top.asshell.dao.DeviceInformationMapper;
import top.asshell.dto.DeviceInformationDTO;
import top.asshell.pojo.DeviceInformation;
import top.asshell.service.DeviceInformationService;

import java.util.List;

@Service
public class DeviceInformationServiceImpl implements DeviceInformationService {
    @Autowired
    private DeviceInformationMapper deviceInformationMapper;

    public Result<PageInfo<DeviceInformation>> getList(DeviceInformationDTO dto) {
        PageHelper.startPage(dto.getPageNum(), dto.getPageSize());
        List<DeviceInformation> list = deviceInformationMapper.getList(dto);
        PageInfo<DeviceInformation> deviceInformationPageInfo = new PageInfo<>(list);
        return Result.success(deviceInformationPageInfo);

    }

    @Override
    public Result update(DeviceInformation deviceInformation) {
        Integer update = deviceInformationMapper.update(deviceInformation);
        if (update < 0) {
            return Result.error("失败");
        }
        return Result.success(update);
    }

    @Override
    public Result del(Integer[] ids) {
        Integer i = 0;
        for (Integer id : ids) {
            i += deviceInformationMapper.remove(id);
        }
        if (i < 0) {
            return Result.error("删除失败");
        }
        return Result.success(null, "一共删除了" + i + "数据");
    }

    @Override
    public Result add(DeviceInformation deviceInformation) {
        Integer save = deviceInformationMapper.save(deviceInformation);
        if (save < 0) {
            return Result.error("失败");
        }
        return Result.success(save);
    }
}
