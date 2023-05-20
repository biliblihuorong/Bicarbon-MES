package top.asshell.controller;

import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.asshell.common.result.Result;
import top.asshell.dto.DataAcquisitionDTO;
import top.asshell.pojo.DataAcquisition;
import top.asshell.service.DataAcquisitionService;

@RestController
@Api(tags = "能源数据采集接口")
@RequestMapping("/dataAcquisition")
public class DataAcquisitionController {
    @Autowired
    private DataAcquisitionService dataAcquisitionService;

    @GetMapping("/getList")

    public Result<PageInfo<DataAcquisition>> getList(DataAcquisitionDTO dto) {
        return dataAcquisitionService.getList(dto);
    }
}
