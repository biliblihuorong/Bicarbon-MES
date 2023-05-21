package top.asshell.service.impl;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.asshell.common.Utils.ServiceUtils;
import top.asshell.common.result.Result;
import top.asshell.dao.CarrierOrderMapper;
import top.asshell.dto.CarrierOrderDTO;
import top.asshell.pojo.CarrierOrder;
import top.asshell.service.CarrierOrderService;
@Service
public class CarrierOrderServiceImpl implements CarrierOrderService {
    @Autowired
    private CarrierOrderMapper carrierOrderMapper;
    @Override
    public Result<PageInfo<CarrierOrder>> getList(CarrierOrderDTO carrierOrderDTO) {
        return ServiceUtils.getList(carrierOrderDTO,carrierOrderMapper);
    }

    @Override
    public Result update(CarrierOrder carrierOrder) {
        return ServiceUtils.update(carrierOrder,carrierOrderMapper);
    }
}
