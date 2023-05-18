package top.asshell.dao;

import org.apache.ibatis.annotations.Mapper;
import top.asshell.pojo.DataAcquisition;

import java.util.List;

@Mapper
public interface DataAcquisitionMapper {


    List<DataAcquisition> getList(String deviceName);


}
