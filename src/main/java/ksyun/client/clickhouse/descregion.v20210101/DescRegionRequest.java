package ksyun.client.clickhouse.descregion.v20210101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescRegionRequest
 * @Description 请求参数
 */
@Data
public class DescRegionRequest {
    /**
     * 商品类型：Clickhouse固定取值：523。
     */
    @KsYunField(name = "ProductType")
    private Integer ProductType;

    /**
     * 地域编码。
     */
    @KsYunField(name = "RegionCode")
    private String RegionCode;

}