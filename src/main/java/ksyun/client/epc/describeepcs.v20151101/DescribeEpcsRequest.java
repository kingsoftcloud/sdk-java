package ksyun.client.epc.describeepcs.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeEpcsRequest
* @Description 请求参数
*/
@Data
public class DescribeEpcsRequest{
    /**服务器所属项目的ID*/
    @KsYunField(name = "ProjectId", type = 1)
    private List<String> ProjectIdList;

    /**裸金属服务器资源ID，可查询多个ID的实例信息*/
    @KsYunField(name = "HostId", type = 1)
    private List<String> HostIdList;

    /**筛选Filter*/
    @KsYunField(name = "Filter", type = 1)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**有效值：
- host-name，裸金属服务器的名称，仅支持精确查询
- vpc-id，裸金属服务器的VPC ID
- subnet-id，裸金属服务器的子网ID
- cabinet-id，托管裸金属服务器的机柜ID
- host-type，裸金属服务器类型
- epc-host-status，裸金属服务器状态
- os-name，操作系统名称
- product-type，类型
- enable-container，是否支持容器
- support-ebs，是否支持云盘
- cluster-id，容器ID 
- private-ip-address，私网Ip地址 
*/
        @KsYunField(name="Name")
        private String Name;

        /***/
        @KsYunField(name = "Value", type = 1)
        private List<String> ValueList;

    }

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**获取另一页返回结果的 token.*/
    @KsYunField(name="NextToken")
    private String NextToken;

}
