package top.asshell.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.asshell.common.result.Result;
import top.asshell.dto.CarrierOrderDTO;
import top.asshell.pojo.CarrierOrder;
import top.asshell.service.CarrierOrderService;

@RestController
@RequestMapping("/carrierOrder")
@Api(tags = "承运单号")
public class CarrierOrderController {
    @Autowired
    private CarrierOrderService service;
    @GetMapping("/getList")
    public Result getList(CarrierOrderDTO carrierOrderDTO){
        return service.getList(carrierOrderDTO);
    }
    @PutMapping("/update")
    public Result update (CarrierOrder carrierOrder){
        return service.update(carrierOrder);
    }
}
