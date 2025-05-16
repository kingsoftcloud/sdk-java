package ksyun.client.kcs.allocateeip.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname AllocateEipRequest
 * @Description 请求参数
 */
@Data
public class AllocateEipRequest {
    /**
     * 可用区     	 默认：对应机房的a区
     */
    @KsYunField(name = "AvailableZone")
    private String AvailableZone;

    /**
     * 缓存服务ID。
     */
    @KsYunField(name = "CacheId")
    private String CacheId;

    /**
     * 实例类型。 	 1:master 仅给主实例上绑定</br>    2:readonly 仅给只读上绑定</br>3:all 给两者上绑定</br>注释：集群版本不需要该参数，主从版需要该参数。
     */
    @KsYunField(name = "InsType")
    private String InsType;

}