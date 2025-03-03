package ksyun.client.monitor.describepolicyobject.v20210101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribePolicyObjectRequest
 * @Description 请求参数
 */
@Data
public class DescribePolicyObjectRequest {
    /**
     * 告警策略ID，详见[查询告警策略](https://docs.ksyun.com/documents/40346)
     */
    @KsYunField(name = "PolicyId")
    private Integer PolicyId;

    /**
     * 页号，起始值：1
     */
    @KsYunField(name = "PageIndex")
    private Integer PageIndex;

    /**
     * 分页时每页显示的数据行数。
     * <p>
     * > 取值范围 1~100
     */
    @KsYunField(name = "PageSize")
    private Integer PageSize;

}