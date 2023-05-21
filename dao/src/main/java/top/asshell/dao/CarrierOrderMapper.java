package top.asshell.dao;

import org.apache.ibatis.annotations.Mapper;
import top.asshell.common.Utils.MapperBase;
import top.asshell.common.Utils.PageHelperDTO;
import top.asshell.dto.CarrierOrderDTO;
import top.asshell.pojo.CarrierOrder;

import java.util.List;

@Mapper
public interface CarrierOrderMapper extends MapperBase<CarrierOrder> {

    List<CarrierOrder> getList(CarrierOrderDTO dto);

    Integer save(CarrierOrder carrierOrder);

    Integer remove(Integer id);

    Integer update(CarrierOrder entity);


}
