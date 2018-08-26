package net.zhaoxitong.mmall.service;

import com.github.pagehelper.PageInfo;
import net.zhaoxitong.mmall.common.ServerResponse;
import net.zhaoxitong.mmall.pojo.Product;
import net.zhaoxitong.mmall.vo.ProductDetailVo;

/**
 * Created by chris on 8/25/2018.
 */
public interface IProductService {

    ServerResponse saveOrUpdateProduct(Product product);

    ServerResponse<String> setSaleStatus(Integer productId, Integer status);

    ServerResponse<ProductDetailVo> manageProductDetail(Integer productId);

    ServerResponse<PageInfo> getProductList(int pageNum, int pageSize);

    ServerResponse<PageInfo> searchProduct(String productName, Integer productId, int pageNum, int pageSize);

    //前台
    ServerResponse<ProductDetailVo> getProductDetail(Integer productId);

    ServerResponse<PageInfo> getProductByKeywordCategory(String keyword, Integer categoryId, int pageNum, int pageSize, String orderBy);
}
