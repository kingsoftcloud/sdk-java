package ksyun.client.kce2.modifycluster.v20230101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyClusterRequest
* @Description 请求参数
*/
@Data
public class ModifyClusterRequest{
    /**集群ID*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**集群新描述信息*/
    @KsYunField(name="ClusterDesc")
    private String ClusterDesc;

    /**更新SANs(覆盖更新)*/
    @KsYunField(name="SANs",type=2)
    private List<String> SANsList;

    /**是否开启apiserver，开启则需要填enable 字段为true，如果关闭，则enable字段为false，不修改，这不填该字段*/
    @KsYunField(name="PublicApiServer")
    private PublicApiServerDto PublicApiServer;

    @Data
    @ToString
    public static class PublicApiServerDto {
        /**EIP ID*/
        @KsYunField(name="EipId")
        private String EipId;

        /**是否开启或关闭Apiserver*/
        @KsYunField(name="Enable")
        private Boolean Enable;

    }

    /**是否开启VpcCNI，开启enable字段为ture，关闭则enable字段为false，不修改则不填
*/
    @KsYunField(name="VpcCNI")
    private VpcCNIDto VpcCNI;

    @Data
    @ToString
    public static class VpcCNIDto {
        /**是否开启或关闭VpcCNi
*/
        @KsYunField(name="Enable")
        private Boolean Enable;

        /**开启vpc-cni必填
网络模式：
• eniOnly  独占网卡
• eniMultiIP  共享网卡*/
        @KsYunField(name="DaemonMode")
        private String DaemonMode;

        /**开启vpc-cni后必填，
vpc的子网id，必须选跟集群同vpc下的子网Id,可以填多个*/
        @KsYunField(name="SubnetId",type=2)
        private List<String> SubnetIdList;

        /**弹性网卡安全组id，需要跟集群同vpc下的安全组id*/
        @KsYunField(name="SecurityGroup")
        private String SecurityGroup;

    }

}
