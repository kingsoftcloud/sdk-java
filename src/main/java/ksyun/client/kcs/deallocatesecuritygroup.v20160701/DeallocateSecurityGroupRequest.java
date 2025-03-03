package ksyun.client.kcs.deallocatesecuritygroup.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname DeallocateSecurityGroupRequest
 * @Description 请求参数
 */
@Data
public class DeallocateSecurityGroupRequest {
    /**
     * 可用区     	 默认：对应机房的a区
     */
    @KsYunField(name = "AvailableZone")
    private String AvailableZone;

    /**
     * 缓存服务ID 	 N：代表数字，示例（CacheId.1=xxx&CacheId.2=yyy）
     */
    @KsYunField(name = "CacheId")
    private List<String> CacheIdList;

    /**
     * 安全组ID   	 安全组ID
     */
    @KsYunField(name = "SecurityGroupId")
    private String SecurityGroupId;


}