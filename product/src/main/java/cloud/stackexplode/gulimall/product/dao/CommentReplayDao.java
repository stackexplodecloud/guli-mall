package cloud.stackexplode.gulimall.product.dao;

import cloud.stackexplode.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author wangudiercai
 * @email 2653084650@qq.com
 * @date 2022-07-10 18:27:08
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
}
