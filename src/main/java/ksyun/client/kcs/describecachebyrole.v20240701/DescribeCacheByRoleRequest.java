package ksyun.client.kcs.describecachebyrole.v20240701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeCacheByRoleRequest
* @Description 请求参数
*/
@Data
public class DescribeCacheByRoleRequest{
    /***/
    @KsYunField(name="CacheId")
    private String CacheId;

    /**节点角色。默认为“ALL”查询全部角色。可选：MASTER、SLAVE、PROXY、ALL.*/
    @KsYunField(name="Role")
    private String Role;

}
