package ksyun.client.aicp.describeterminatepolicy.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeTerminatePolicyResponse
* @Description DescribeTerminatePolicy 返回体
*/
@Data
@ToString
public class DescribeTerminatePolicyResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**关停策略列表*/
    @JsonProperty("TerminatePolices")
    private List<TerminatePolicesDto> TerminatePolices;

    @Data
    @ToString
    public static class TerminatePolicesDto {
        /**名称*/
        @JsonProperty("Name")
        private String Name;

        /**队列ID*/
        @JsonProperty("QueueId")
        private String QueueId;

        /**关停策略类型
- ResourceUseRate 资源使用率
- WhiteList 白名单*/
        @JsonProperty("TerminatePolicyType")
        private String TerminatePolicyType;

        /**策略对象
- Notebook 开发任务*/
        @JsonProperty("TerminatePolicyTarget")
        private String TerminatePolicyTarget;

        /**资源ID列表，当 TerminatePolicyType = WhiteList时存在*/
        @JsonProperty("InstanceIds")
        private List<String> InstanceIds;

        /**资源利用率配置，当TerminatePolicyType = ResourceUseRate存在*/
        @JsonProperty("UseRatePolicy")
        private TerminatePolicesUseRatePolicyDto UseRatePolicy;

        @Data
        @ToString
        public static class TerminatePolicesUseRatePolicyDto {
            /**CPU使用率*/
            @JsonProperty("Cpu")
            private String Cpu;

            /**内存利用率*/
            @JsonProperty("Memory")
            private String Memory;

            /**GPU使用率*/
            @JsonProperty("Gpu")
            private String Gpu;

            /**策略命中持续时长(单位，小时)*/
            @JsonProperty("Hour")
            private Integer Hour;

        }

        /**关停策略ID*/
        @JsonProperty("TerminatePolicyId")
        private String TerminatePolicyId;

        /**创建者*/
        @JsonProperty("CreateUser")
        private String CreateUser;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**更新时间*/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

        /**创建者用户名称*/
        @JsonProperty("CreateUserName")
        private String CreateUserName;

    }

    /**查询最大数*/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**策略总数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**页数*/
    @JsonProperty("Page")
    private Integer Page;

}
