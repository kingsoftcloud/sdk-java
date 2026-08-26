package ksyun.client.vpc.describepathtasks.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribePathTasksResponse
* @Description DescribePathTasks 返回体
*/
@Data
@ToString
public class DescribePathTasksResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("PathTaskSet")
    private List<PathTaskSetDto> PathTaskSet;

    @Data
    @ToString
    public static class PathTaskSetDto {
        /**任务ID*/
        @JsonProperty("PathTaskId")
        private String PathTaskId;

        /**任务状态*/
        @JsonProperty("PathTaskStatus")
        private String PathTaskStatus;

        /**任务结果*/
        @JsonProperty("PathTaskReachableResult")
        private String PathTaskReachableResult;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**路径分析ID*/
        @JsonProperty("PathId")
        private String PathId;

        /**更新时间*/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

        /***/
        @JsonProperty("NodeReachableAnalyses")
        private List<PathTaskSetNodeReachableAnalysesDto> NodeReachableAnalyses;

        @Data
        @ToString
        public static class PathTaskSetNodeReachableAnalysesDto {
            /**节点实例ID*/
            @JsonProperty("NodeInstanceId")
            private String NodeInstanceId;

            /**创建时间*/
            @JsonProperty("CreateTime")
            private String CreateTime;

            /**更新时间*/
            @JsonProperty("UpdateTime")
            private String UpdateTime;

            /**节点类型*/
            @JsonProperty("NodeType")
            private String NodeType;

            /***/
            @JsonProperty("NodeOrder")
            private Integer NodeOrder;

            /***/
            @JsonProperty("Reachable")
            private String Reachable;

            /**机房*/
            @JsonProperty("Region")
            private String Region;

            /**详情*/
            @JsonProperty("Details")
            private String Details;

            /**可用区名称*/
            @JsonProperty("AzName")
            private String AzName;

        }

    }

    /**获取另一页返回结果的 token*/
    @JsonProperty("NextToken")
    private String NextToken;

}
