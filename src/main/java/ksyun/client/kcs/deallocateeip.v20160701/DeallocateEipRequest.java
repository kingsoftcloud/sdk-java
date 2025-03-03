package ksyun.client.kcs.deallocateeip.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeallocateEipRequest
 * @Description 请求参数
 */
@Data
public class DeallocateEipRequest {
    /**
     * 可用区     	 默认：对应机房的a区
     */
    @KsYunField(name = "AvailableZone")
    private String AvailableZone;

    /**
     * 缓存服务ID 	 缓存服务ID
     */
    @KsYunField(name = "CacheId")
    private String CacheId;

    /**
     * 实例类型   	 1:master 仅给主节点解绑</br>2:readonly 仅给只读节点解绑</br>3:all 给两者都解绑</br>注释：集群版本不需要该参数，主从版需要该参数
     */
    @KsYunField(name = "InsType")
    private String InsType;


}