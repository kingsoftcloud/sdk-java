package ksyun.client.kmr.scaleininstancegroups.v20210902;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ScaleInInstanceGroupsRequest
* @Description 请求参数
*/
@Data
public class ScaleInInstanceGroupsRequest{
    /**集群ID*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**要缩容的节点组，需要注意的是，一次只能对一个节点组进行操作*/
    @KsYunField(name="InstanceGroups",type=2)
    private List<InstanceGroupsDto> InstanceGroupsList;

    @Data
    @ToString
    public static class InstanceGroupsDto {
        /**节点组 id，需要注意的是，仅可对 Task 节点或 Gateway 节点进行缩容操作。节点组 id 可通过 DescribeCluster 接口获得*/
        @KsYunField(name="Id")
        private String Id;

        /**要缩容的实例列表，不支持缩容中间实例，如果要缩容中间实例需提工单处理*/
        @KsYunField(name="instances",type=2)
        private List<InstanceGroupsInstancesDto> InstancesList;

        @Data
        @ToString
        public static class InstanceGroupsInstancesDto {
            /**要缩容的实例 id，实例 id 可通过DescribeCluster 接口获得*/
            @KsYunField(name="InstanceId")
            private String InstanceId;

        }

    }

    /**是否开启优雅缩容*/
    @KsYunField(name="GracefulScaleIn")
    private Boolean GracefulScaleIn;

    /**优雅缩容等待时间，如果开启优雅缩容，则需要设定该参数，范围0-120, 单位秒*/
    @KsYunField(name="GracefulScaleInTimeout")
    private Integer GracefulScaleInTimeout;

}
