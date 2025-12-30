package ksyun.client.kce2.deletecluster.v20230101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteClusterRequest
* @Description 请求参数
*/
@Data
public class DeleteClusterRequest{
    /**集群ID*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**是否删除主机*/
    @KsYunField(name="InstanceDelete")
    private Boolean InstanceDelete;

    /**默认为fasle
为ture时会尝试删除集群安全组
为false时不会尝试删除集群安全组*/
    @KsYunField(name="SecurityGroupDelete")
    private Boolean SecurityGroupDelete;

    /**是否删除私网负载均衡实例（如果是alb且为公私网合一，则只需要删除私网负载均衡即可）*/
    @KsYunField(name="PrivateLbDelete")
    private Boolean PrivateLbDelete;

    /**是否删除公网负载均衡实例*/
    @KsYunField(name="PublicLbDelete")
    private Boolean PublicLbDelete;

}
