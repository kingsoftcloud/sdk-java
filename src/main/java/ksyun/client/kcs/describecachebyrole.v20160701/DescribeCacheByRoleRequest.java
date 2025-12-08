package ksyun.client.kcs.describecachebyrole.v20160701;

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
    /**可用区       	 默认：对应机房的a区*/
    @KsYunField(name="AvailableZone")
    private String AvailableZone;

    /**缓存服务ID */
    @KsYunField(name="CacheId")
    private String CacheId;

    /**节点角色。默认查询全部。可选：MASTER、SLAVE、READONLY、PROXY*/
    @KsYunField(name="Proxy")
    private String Proxy;

}
