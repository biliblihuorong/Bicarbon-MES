package top.asshell.dao;

import org.apache.ibatis.annotations.Mapper;
import top.asshell.dto.MaterialDTO;
import top.asshell.pojo.Material;

import java.util.List;

@Mapper
public interface MaterialMapper {

    List<Material> getList(MaterialDTO materialDTO);

    Integer save(Material material);

    Integer remove(Integer id);

    Integer update(Material Material);


}
