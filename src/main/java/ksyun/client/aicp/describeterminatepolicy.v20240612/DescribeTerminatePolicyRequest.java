package ksyun.client.aicp.describeterminatepolicy.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeTerminatePolicyRequest
* @Description 请求参数
*/
@Data
public class DescribeTerminatePolicyRequest{
    /**队列ID*/
    @KsYunField(name="QueueId")
    private String QueueId;

    /**关停策略ID*/
    @KsYunField(name="TerminatePolicyId",type=1)
    private List<String> TerminatePolicyIdList;

    /**创建者ID*/
    @KsYunField(name="CreateUser")
    private String CreateUser;

    /**过滤器*/
    @KsYunField(name="Filter",type=1)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**过滤参数：
 - name 名称
 - policy-type 关停策略类型
 - policy-target 策略对象*/
        @KsYunField(name="Name")
        private String Name;

        /**value*/
        @KsYunField(name="Value",type=1)
        private List<String> ValueList;

    }

    /**单页查询数*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

    /**页数*/
    @KsYunField(name="Page")
    private Integer Page;

}
