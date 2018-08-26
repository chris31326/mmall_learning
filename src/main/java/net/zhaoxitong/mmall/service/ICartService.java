package net.zhaoxitong.mmall.service;

import net.zhaoxitong.mmall.common.ServerResponse;
import net.zhaoxitong.mmall.vo.CartVo;

/**
 * Created by chris on 8/26/2018.
 */
public interface ICartService {
    ServerResponse<CartVo> add(Integer userId, Integer productId, Integer count);

    ServerResponse<CartVo> update(Integer userId, Integer productId, Integer count);

    ServerResponse<CartVo> deleteProduct (Integer userId,String productIds);

    ServerResponse<CartVo> selectOrUnselect (Integer userId,Integer checked ,Integer productId);

    ServerResponse<CartVo> list (Integer userId);

    ServerResponse<Integer> getCartProductCount(Integer userId);
}
