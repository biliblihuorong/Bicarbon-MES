package top.asshell.controller;

import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.asshell.common.result.Result;
import top.asshell.dto.MaterialDTO;
import top.asshell.pojo.Material;
import top.asshell.service.MaterialService;

@RestController
@RequestMapping("/material")
@Api(tags = "产品建模接口")
public class MaterialController {
    @Autowired
    private MaterialService service;

    @GetMapping("/getList")
    public Result<PageInfo<Material>> getList(MaterialDTO dto) {
        return service.getList(dto);
    }

    @ApiOperation("删除")
    @DeleteMapping("/delete")
    public Result delete(@RequestBody Integer ids[]) {
        return service.delete(ids);
    }

    @ApiOperation("更新")
    @PutMapping("/update")
    public Result update(@RequestBody Material material) {
        return service.update(material);
    }

    @ApiOperation("新增")
    @PostMapping("/add")
    public Result add(@RequestBody Material material) {
        return service.add(material);
    }
}
