package top.asshell.dao;

import org.apache.ibatis.annotations.Mapper;
import top.asshell.common.Utils.MapperBase;
import top.asshell.pojo.DataAcquisition;

import java.util.List;

@Mapper
public interface DataAcquisitionMapper extends MapperBase<DataAcquisition> {


    List<DataAcquisition> getList(String deviceName);


}
