package top.asshell.common.Utils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import top.asshell.common.result.Result;

import java.util.List;

@Service
public class ServiceUtils {

    public static <T> Result<PageInfo<T>> getList(PageHelperDTO dto, MapperBase<T> mapper) {
        PageHelper.startPage(dto.getPageNum(), dto.getPageSize());
        List<T> list = mapper.getList(dto);
        PageInfo<T> pageInfo = new PageInfo<>(list);
        return Result.success(pageInfo);
    }

    public static <T> Result update(T entity, MapperBase<T> mapper) {
        Integer update = mapper.update(entity);
        if (update < 0) {
            return Result.error("失败");
        }
        return Result.success(update);
    }

    public static <T> Result add(T entity, MapperBase<T> mapper) {
        Integer save = mapper.save(entity);
        if (save < 0) {
            return Result.error("添加失败");
        }
        return Result.success(null, "成功");
    }

    public static <T> Result delete(Integer[] ids, MapperBase<T> mapper) {
        Integer count = 0;
        for (Integer id : ids) {
            count += mapper.remove(id);
        }
        if (count < 0) {
            return Result.error("删除失败");
        }
        return Result.success(null, "一共删除了" + count + "数据");
    }
}
