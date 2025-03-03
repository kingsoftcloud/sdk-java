package ksyun.client.tidb.descregion.v20210520;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescRegionRequest
 * @Description 请求参数
 */
@Data
public class DescRegionRequest {
    /**
     * 地域标识。例如：cn-shanghai-3。
     */
    @KsYunField(name = "RegionCode")
    private String RegionCode;

    /**
     * 商品类型。取固定值：577。
     */
    @KsYunField(name = "ProductType")
    private Integer ProductType;

}