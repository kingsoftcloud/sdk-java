package ksyun.client.aicp.describeinferencepods.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInferencePodsResponse
* @Description DescribeInferencePods 返回体
*/
@Data
@ToString
public class DescribeInferencePodsResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**总数量*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**页码*/
    @JsonProperty("Page")
    private Integer Page;

    /**单次调用返回最大条目个数*/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**推理任务pod列表*/
    @JsonProperty("Pods")
    private List<PodsDto> Pods;

    @Data
    @ToString
    public static class PodsDto {
        /**Pod名称*/
        @JsonProperty("PodName")
        private String PodName;

        /**推理服务ID*/
        @JsonProperty("InferenceId")
        private String InferenceId;

        /**命名空间*/
        @JsonProperty("Namespace")
        private String Namespace;

        /**角色*/
        @JsonProperty("Role")
        private String Role;

        /**集群ID*/
        @JsonProperty("ClusterId")
        private String ClusterId;

        /**Pod状态*/
        @JsonProperty("Status")
        private String Status;

        /**Pod所在节点IP*/
        @JsonProperty("NodeIp")
        private String NodeIp;

        /**启动时间*/
        @JsonProperty("StartTime")
        private String StartTime;

        /**结束时间*/
        @JsonProperty("EndTime")
        private String EndTime;

    }

}
