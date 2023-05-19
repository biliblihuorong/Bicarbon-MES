package top.asshell.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.asshell.common.result.Result;
import top.asshell.dao.MaterialMapper;
import top.asshell.dto.MaterialDTO;
import top.asshell.pojo.Material;
import top.asshell.service.MaterialService;

import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService {
    @Autowired
    private MaterialMapper mapper;

    @Override
    public Result update(Material material) {
        Integer update = mapper.update(material);
        if (update < 0) {
            return Result.error("失败");
        }
        return Result.success(update);
    }

    @Override
    public Result delete(Integer[] ids) {
        Integer i = 0;
        for (Integer id : ids) {
            i += mapper.remove(id);
        }
        if (i < 0) {
            return Result.error("删除失败");
        }
        return Result.success(null, "一共删除了" + i + "数据");
    }

    @Override
    public Result add(Material material) {
        Integer save = mapper.save(material);
        if (save < 0) {
            return Result.error("添加失败");
        }

        return Result.success(null, "成功");
    }

    @Override
    public Result<PageInfo<Material>> getList(MaterialDTO materialDTO) {
        PageHelper.startPage(materialDTO.getPageNum(), materialDTO.getPageSize());
        List<Material> list = mapper.getList(materialDTO);
        PageInfo<Material> materialPageInfo = new PageInfo<>(list);
        return Result.success(materialPageInfo);
    }
}
