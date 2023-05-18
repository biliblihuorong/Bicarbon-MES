package top.asshell.controller;

import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @ApiOperation("删除")
    @DeleteMapping("/delete")
    public Result delete(@RequestBody Integer ids[]){
        return service.del(ids);
    }

    @ApiOperation("更新")
    @PutMapping("/update")
    public Result update (@RequestBody DeviceInformation deviceInformation){
        return service.update(deviceInformation);
    }

    @ApiOperation("新增")
    @PostMapping("/add")
    public Result add(@RequestBody DeviceInformation deviceInformation){
        return service.add(deviceInformation);
    }
}
