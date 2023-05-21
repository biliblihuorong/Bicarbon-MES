package top.asshell.service;

import com.github.pagehelper.PageInfo;
import top.asshell.common.result.Result;
import top.asshell.dto.CarrierOrderDTO;
import top.asshell.pojo.CarrierOrder;

import java.util.List;

public interface CarrierOrderService {
    Result<PageInfo<CarrierOrder>> getList(CarrierOrderDTO carrierOrderDTO);

    Result update (CarrierOrder carrierOrder);
}
