package top.asshell.service;

import com.github.pagehelper.PageInfo;
import top.asshell.common.result.Result;
import top.asshell.dto.MaterialDTO;
import top.asshell.pojo.Material;

public interface MaterialService {
    Result update (Material material);
    Result delete (Integer ids []);

    Result add (Material material);

    Result<PageInfo<Material>> getList(MaterialDTO materialDTO);
}
