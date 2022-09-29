package cloud.stackexplode.gulimall.product.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class AttrRespVo extends AttrVo {
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Long[] catelogPath;

    private String catelogName;

    private String groupName;
}
