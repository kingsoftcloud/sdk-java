package ksyun.client.aicp.describeresourcepoolinstances.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeResourcePoolInstancesRequest
* @Description 请求参数
*/
@Data
public class DescribeResourcePoolInstancesRequest{
    /**	
资源组d*/
    @KsYunField(name="ResourcePoolId")
    private String ResourcePoolId;

    /**单次调用所返回的最大实例数目，默认1000, 范围值为[5, 1000]*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

    /**页码*/
    @KsYunField(name="Page")
    private Integer Page;

    /**实例名称，可模糊匹配

*/
    @KsYunField(name="InstanceName")
    private String InstanceName;

    /**	
实例ID*/
    @KsYunField(name = "InstanceId", type = 1)
    private List<String> InstanceIdList;

    /**项目制*/
    @KsYunField(name = "ProjectId", type = 1)
    private List<String> ProjectIdList;

    /**一个或者多个过滤器*/
    @KsYunField(name = "Filter", type = 1)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**有效值：

- node-type 节点类型 KEC/EPC
- instance-status 节点状态
- instance-ip 节点IP*/
        @KsYunField(name="Name")
        private String Name;

        /**过滤值*/
        @KsYunField(name = "Value", type = 1)
        private List<String> ValueList;

    }

}
