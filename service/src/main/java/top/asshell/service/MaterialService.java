package top.asshell.service;

import com.github.pagehelper.PageInfo;
import top.asshell.common.result.Result;
import top.asshell.dto.MaterialDTO;
import top.asshell.pojo.Material;

import java.util.List;

public interface MaterialService {
    Result update (Material material);
    Result delete (List<Integer> ids);

    Result add (Material material);

    Result<PageInfo<Material>> getListEnergyEfficiency (MaterialDTO materialDTO);
}
