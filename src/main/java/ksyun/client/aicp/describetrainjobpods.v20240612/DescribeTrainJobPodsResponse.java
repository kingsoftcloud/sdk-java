package ksyun.client.aicp.describetrainjobpods.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeTrainJobPodsResponse
* @Description DescribeTrainJobPods 返回体
*/
@Data
@ToString
public class DescribeTrainJobPodsResponse extends BaseResponseModel {

    /**单页pod数量*/
    @JsonProperty("MaxResults")
    private Integer MaxResults;

    /***/
    @JsonProperty("TrainJobPodSet")
    private List<TrainJobPodSetDto> TrainJobPodSet;

    @Data
    @ToString
    public static class TrainJobPodSetDto {
        /**训练任务ID*/
        @JsonProperty("TrainJobId")
        private String TrainJobId;

        /**角色*/
        @JsonProperty("Role")
        private String Role;

        /**任务重启次数*/
        @JsonProperty("StartTimes")
        private Integer StartTimes;

        /**pod名称*/
        @JsonProperty("PodName")
        private String PodName;

        /***/
        @JsonProperty("Status")
        private TrainJobPodSetStatusDto Status;

        @Data
        @ToString
        public static class TrainJobPodSetStatusDto {
            /**状态*/
            @JsonProperty("State")
            private String State;

            /**容器状态*/
            @JsonProperty("ContainerState")
            private String ContainerState;

            /**提交时间*/
            @JsonProperty("SubmitTime")
            private String SubmitTime;

            /**开始时间*/
            @JsonProperty("StartTime")
            private String StartTime;

            /**结束时间*/
            @JsonProperty("EndTime")
            private String EndTime;

            /**Pod所在节点IP*/
            @JsonProperty("Ip")
            private String Ip;

            /**Pod重启次数*/
            @JsonProperty("RestartCount")
            private Integer RestartCount;

        }

        /**容器名称*/
        @JsonProperty("ContainerName")
        private String ContainerName;

        /**负载类型*/
        @JsonProperty("Kind")
        private String Kind;

        /**pod所在命名空间*/
        @JsonProperty("NameSpace")
        private String NameSpace;

    }

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**pod总数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**分页参数，从1开始*/
    @JsonProperty("Marker")
    private Integer Marker;

}
