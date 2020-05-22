package io.seata.samples.integration.storage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.seata.samples.integration.storage.entity.TStorage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * * @author lidong
 * @since 2019-09-04
 */
@Mapper
public interface TStorageMapper extends BaseMapper<TStorage> {

    /**
     * 扣减商品库存
     * @Param: commodityCode 商品code  count扣减数量
     * @Return:
     */
    int decreaseStorage(@Param("id") Integer id, @Param("count") Integer count);
}
