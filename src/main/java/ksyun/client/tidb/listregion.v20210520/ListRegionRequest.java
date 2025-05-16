package ksyun.client.tidb.listregion.v20210520;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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