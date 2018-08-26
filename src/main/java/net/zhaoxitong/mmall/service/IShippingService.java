package net.zhaoxitong.mmall.service;

import com.github.pagehelper.PageInfo;
import net.zhaoxitong.mmall.common.ServerResponse;
import net.zhaoxitong.mmall.pojo.Shipping;

/**
 * Created by chris on 8/26/2018.
 */
public interface IShippingService {
    ServerResponse add(Integer userId, Shipping shipping);

    ServerResponse<String> del(Integer userId, Integer shippingId);

    ServerResponse update(Integer userId, Shipping shipping);

    ServerResponse<Shipping> select(Integer userId, Integer shippingId);

    ServerResponse<PageInfo> list(Integer userId, int pageNum, int pageSize);
}
