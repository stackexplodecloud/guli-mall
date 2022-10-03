package cloud.stackexplode.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author wangudiercai
 * @email 2653084650@qq.com
 * @date 2022-07-10 21:38:58
 */
@Data @Accessors(fluent = false, chain = true)
@TableName("sms_home_subject")
public class HomeSubjectEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 专题名字
     */
    private String name;
    /**
     * 专题标题
     */
    private String title;
    /**
     * 专题副标题
     */
    private String subTitle;
    /**
     * 显示状态
     */
    private Integer status;
    /**
     * 详情连接
     */
    private String url;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 专题图片地址
     */
    private String img;
}
