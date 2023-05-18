package top.asshell.controller;

import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.asshell.common.result.Result;
import top.asshell.dto.DeviceInformationDTO;
import top.asshell.pojo.DeviceInformation;
import top.asshell.service.DeviceInformationService;

@RestController
@Api(tags = "设备信息管理页面")
@RequestMapping("/deviceInformation")
public class DeviceInformationController {
    @Autowired
    private DeviceInformationService service;
    @GetMapping("/getList")
    public Result<PageInfo<DeviceInformation>> getList(DeviceInformationDTO dto){
        return service.getList(dto);
    }
}
