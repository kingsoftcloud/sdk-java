package ksyun.client.tidb.listregion.v20210520;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListRegionRequest
 * @Description 请求参数
 */
@Data
public class ListRegionRequest {
    /**
     * 取固定取值：577。
     */
    @KsYunField(name = "ProductType")
    private Integer ProductType;

}