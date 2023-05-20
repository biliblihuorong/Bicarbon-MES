package top.asshell.common.Utils;

import java.util.List;

public  interface MapperBase<T>{
      List<T> getList(PageHelperDTO dto);

     Integer save(T entity);

     Integer remove(Integer id);

     Integer update(T entity);

}
