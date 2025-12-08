package ksyun.client.kcs.addcacheslavenode.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AddCacheSlaveNodeRequest
* @Description 请求参数
*/
@Data
public class AddCacheSlaveNodeRequest{
    /**缓存服务ID*/
    @KsYunField(name="CacheId")
    private String CacheId;

    /**只读节点指定内网ip
*/
    @KsYunField(name="SlaveVip")
    private String SlaveVip;

}
