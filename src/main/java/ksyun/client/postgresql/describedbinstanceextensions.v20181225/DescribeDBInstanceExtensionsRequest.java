package ksyun.client.postgresql.describedbinstanceextensions.v20181225;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeDBInstanceExtensionsRequest
 * @Description 请求参数
 */
@Data
public class DescribeDBInstanceExtensionsRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 绑定类型(绑定/未绑定)
     * <p>
     * ```json
     * 支持接口选定查询是否绑定，不传则都查询出来(绑定+解绑)；
     * installed
     * uninstalled
     * ```
     */
    @KsYunField(name = "KeyWord")
    private String KeyWord;

}