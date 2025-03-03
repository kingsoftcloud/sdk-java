package ksyun.client.kcs.allocatesecuritygroup.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname AllocateSecurityGroupRequest
 * @Description 请求参数
 */
@Data
public class AllocateSecurityGroupRequest {
    /**
     * 可用区     	 默认：对应机房的a区
     */
    @KsYunField(name = "AvailableZone")
    private String AvailableZone;

    /**
     * 缓存服务ID 	 N：代表数字，示例（CacheId.1=xxxx&CacheId.2=yyyy），每个缓存服务都会绑定SecurityGroupId.N
     */
    @KsYunField(name = "CacheId")
    private List<String> CacheIdList;

    /**
     * 安全组ID   	 N：代表数字，示例（SecurityGroupId.1=xxxx&SecurityGroupId.2=yyyy）
     */
    @KsYunField(name = "SecurityGroupId")
    private List<String> SecurityGroupIdList;


}