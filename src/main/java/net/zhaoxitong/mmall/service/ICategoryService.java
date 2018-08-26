package net.zhaoxitong.mmall.service;

import net.zhaoxitong.mmall.common.ServerResponse;
import net.zhaoxitong.mmall.pojo.Category;

import java.util.List;

/**
 * Created by chris on 8/25/2018.
 */
public interface ICategoryService {

    ServerResponse addCategory(String categoryName, Integer parentId);

    ServerResponse updateCategoryName(Integer categoryId, String categoryName);

    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);
}
