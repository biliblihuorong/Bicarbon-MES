package top.asshell.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.asshell.common.Utils.ServiceUtils;
import top.asshell.common.result.Result;
import top.asshell.dao.DataAcquisitionMapper;
import top.asshell.dto.DataAcquisitionDTO;
import top.asshell.pojo.DataAcquisition;
import top.asshell.service.DataAcquisitionService;

import java.util.List;

@Service
public class DataAcquisitionServiceImpl implements DataAcquisitionService {
    @Autowired
    private DataAcquisitionMapper dataAcquisitionMapper;

    @Override
    public Result<PageInfo<DataAcquisition>> getList(DataAcquisitionDTO dto) {
        return ServiceUtils.getList(dto,dataAcquisitionMapper);
    }
}
