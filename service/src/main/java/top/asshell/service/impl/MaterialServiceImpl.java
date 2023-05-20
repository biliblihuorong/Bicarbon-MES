package top.asshell.service.impl;


import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.asshell.common.Utils.ServiceUtils;
import top.asshell.common.result.Result;
import top.asshell.dao.MaterialMapper;
import top.asshell.dto.MaterialDTO;
import top.asshell.pojo.Material;
import top.asshell.service.MaterialService;


@Service
public class MaterialServiceImpl implements MaterialService {
    @Autowired
    private MaterialMapper mapper;

    @Override
    public Result update(Material material) {
        return ServiceUtils.update(material,mapper);
    }

    @Override
    public Result delete(Integer[] ids) {
        return ServiceUtils.delete(ids,mapper);
    }


    @Override
    public Result add(Material material) {
        return ServiceUtils.add(material,mapper);
    }

    @Override
    public Result<PageInfo<Material>> getList(MaterialDTO materialDTO) {
        return ServiceUtils.getList(materialDTO,mapper);
    }


}
