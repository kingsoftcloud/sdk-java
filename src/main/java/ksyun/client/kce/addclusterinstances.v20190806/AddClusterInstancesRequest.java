package ksyun.client.kce.addclusterinstances.v20190806;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AddClusterInstancesRequest
* @Description 请求参数
*/
@Data
public class AddClusterInstancesRequest{
    /**集群id*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**节点配置信息<br>NodeRole只能是Worker。*/
    @KsYunField(name="InstanceSet")
    private List<InstanceSetDto> InstanceSetList;

    @Data
    @ToString
    public static class InstanceSetDto {
        /**节点角色,有效值：Worker、Master_Etcd、Master、Etcd
- ClusterManageMode字段为DedicatedCluster
   当MasterEtcdSeparate字段设置为False时，Worker和Master_Etcd需要同时指定；
   当MasterEtcdSeparate字段设置为True时，Master、Etcd和Worker角色需要同时指定。
- Master_Etcd、Master、Etcd目前只能是3个或者5个。
- Master_Etcd、Master、Etcd建议配置4C8G起，数据盘建议SSD，50G起。*/
        @KsYunField(name="NodeRole")
        private String NodeRole;
        /**定义节点的配置，支持普通云主机和专属云主机。
节点配置信息使用云主机/专属云主机创建透传参数，json化字符串格式，详见云主机创建实例接口和专属云主机创建实例接口*/
        @KsYunField(name="NodePara")
        private List<String> NodeParaList;
        /**节点高级设置*/
        @KsYunField(name="AdvancedSetting")
    }


}