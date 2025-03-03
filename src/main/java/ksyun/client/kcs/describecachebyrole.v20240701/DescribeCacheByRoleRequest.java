package ksyun.client.kcs.describecachebyrole.v20240701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeCacheByRoleRequest
 * @Description 请求参数
 */
@Data
public class DescribeCacheByRoleRequest {
    /***/
    @KsYunField(name = "CacheId")
    private String CacheId;

    /**
     * 节点角色。默认为“ALL”查询全部角色。可选：MASTER、SLAVE、PROXY、ALL.
     */
    @KsYunField(name = "Role")
    private String Role;

}