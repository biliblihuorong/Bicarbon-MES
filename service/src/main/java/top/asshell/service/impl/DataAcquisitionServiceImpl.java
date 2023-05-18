package top.asshell.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.asshell.common.result.Result;
import top.asshell.dao.DataAcquisitionMapper;
import top.asshell.pojo.DataAcquisition;
import top.asshell.service.DataAcquisitionService;

import java.util.List;

@Service
public class DataAcquisitionServiceImpl implements DataAcquisitionService {
    @Autowired
    private DataAcquisitionMapper dataAcquisitionMapper;

    public Result<PageInfo<DataAcquisition>> getList(String deviceName, Integer pageNum, Integer pageSize){

        PageHelper.startPage(pageNum,pageSize);
        List<DataAcquisition> list = dataAcquisitionMapper.getList(deviceName);
        PageInfo<DataAcquisition> dataAcquisitionPageInfo = new PageInfo<>(list);
        return Result.success(dataAcquisitionPageInfo);


    }
}
