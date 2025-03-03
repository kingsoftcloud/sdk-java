package ksyun.client.clickhouse.listsecuritygroup.v20210101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListSecurityGroupRequest
 * @Description 请求参数
 */
@Data
public class ListSecurityGroupRequest {
    /**
     * 商品类型：Clickhouse固定取值：523。
     */
    @KsYunField(name = "ProductType")
    private Integer ProductType;


}