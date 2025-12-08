package ksyun.client.kcs.opendirectaccesstocluster.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname OpenDirectAccessToClusterRequest
* @Description 请求参数
*/
@Data
public class OpenDirectAccessToClusterRequest{
    /**可用区。默认为当前region的a区。*/
    @KsYunField(name="AvailableZone")
    private String AvailableZone;

    /**缓存服务ID*/
    @KsYunField(name="CacheId")
    private String CacheId;

    /**终端网络id*/
    @KsYunField(name="SubnetId")
    private String SubnetId;

    /**虚拟网络VPC id*/
    @KsYunField(name="VpcId")
    private String VpcId;

}
