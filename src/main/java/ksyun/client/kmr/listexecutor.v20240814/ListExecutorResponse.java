package ksyun.client.kmr.listexecutor.v20240814;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListExecutorResponse
* @Description ListExecutor 返回体
*/
@Data
@ToString
public class ListExecutorResponse extends BaseResponseModel {
    /**状态码*/
    @JsonProperty("status")
    private Integer Status;

    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**响应状态码*/
        @JsonProperty("Code")
        private Integer Code;

        /**响应信息*/
        @JsonProperty("Message")
        private String Message;

        /**请求ID*/
        @JsonProperty("RequestId")
        private String RequestId;

        /***/
        @JsonProperty("Data")
        private DataDtoDataDto Data;

        @Data
        @ToString
        public static class DataDtoDataDto {
            /**本次请求返回记录数*/
            @JsonProperty("Count")
            private Integer Count;

            /**Executor总数*/
            @JsonProperty("Total")
            private Integer Total;

            /***/
            @JsonProperty("List")
            private List<DataDtoDataDtoListDto> List;

            @Data
            @ToString
            public static class DataDtoDataDtoListDto {
                /**Executor ID*/
                @JsonProperty("Id")
                private String Id;

                /**Executor pod地址，包括IP和端口。*/
                @JsonProperty("Address")
                private String Address;

                /**Executor pod状态
Active：活跃
Dead：异常终止*/
                @JsonProperty("Status")
                private String Status;

                /**存储的RDD块数量*/
                @JsonProperty("RddBlocks")
                private Integer RddBlocks;

                /**使用的存储内存大小*/
                @JsonProperty("StorageMemory")
                private String StorageMemory;

                /**Executor所在pod的最大可用内存*/
                @JsonProperty("MaxMemory")
                private String MaxMemory;

                /**使用的磁盘空间大小*/
                @JsonProperty("DiskUsed")
                private String DiskUsed;

                /**CPU核数*/
                @JsonProperty("Cores")
                private Integer Cores;

                /**活跃的Task数*/
                @JsonProperty("ActiveTasks")
                private Integer ActiveTasks;

                /**失败的Task数*/
                @JsonProperty("FailedTasks")
                private Integer FailedTasks;

                /**完成的Task数*/
                @JsonProperty("CompletedTasks")
                private Integer CompletedTasks;

                /**Task总数*/
                @JsonProperty("TotalTasks")
                private Integer TotalTasks;

                /**Task执行总时间*/
                @JsonProperty("TasksTime")
                private String TasksTime;

                /**垃圾回收总时间*/
                @JsonProperty("TotalGCTime")
                private String TotalGCTime;

                /**所有任务的输入字节总数*/
                @JsonProperty("TotalInputBytes")
                private String TotalInputBytes;

                /**所有任务的Shuffle读数据总量*/
                @JsonProperty("TotalShuffleRead")
                private String TotalShuffleRead;

                /**所有任务的Shuffle写数据总量*/
                @JsonProperty("TotalShuffleWrite")
                private String TotalShuffleWrite;

                /**与executor节点关联的Pod名称，可用于查询日志*/
                @JsonProperty("PodName")
                private String PodName;

            }

        }

    }

    /***/
    @JsonProperty("message")
    private String Message;

}
