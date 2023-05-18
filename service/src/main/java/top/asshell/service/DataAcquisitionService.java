package top.asshell.service;

import com.github.pagehelper.PageInfo;
import top.asshell.common.result.Result;
import top.asshell.pojo.DataAcquisition;

public interface DataAcquisitionService {
    Result<PageInfo<DataAcquisition>> getList(String deviceName, Integer pageNum, Integer pageSize);

}
