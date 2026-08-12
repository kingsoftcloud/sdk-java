package ksyun.client.kpfs.describedataflowtasklist.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDataFlowTaskListResponse
* @Description DescribeDataFlowTaskList 返回体
*/
@Data
@ToString
public class DescribeDataFlowTaskListResponse extends BaseResponseModel {

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**数据流动任务列表*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**数据流动任务ID，唯一标识。*/
        @JsonProperty("TaskId")
        private String TaskId;

        /**运行状态。共等待、运行中、暂停、完成四种状态。*/
        @JsonProperty("Status")
        private String Status;

        /**传输文件数量，导入文件的总数量。*/
        @JsonProperty("TransferFileCount")
        private Long TransferFileCount;

        /**传输文件数据量，单位为Byte。导入文件的总大小。*/
        @JsonProperty("TransferFileData")
        private Long TransferFileData;

        /**传输文件带宽，单位为Byte/s。*/
        @JsonProperty("TransferThroughput")
        private Long TransferThroughput;

        /**传输OPS。仅KPFS-P1存储池类型支持。*/
        @JsonProperty("TransferOps")
        private Long TransferOps;

        /**任务开始时间。*/
        @JsonProperty("StartTime")
        private String StartTime;

        /**任务结束时间，导入任务为等待、运行中、暂停三种状态时，该字段返回0。*/
        @JsonProperty("EndTime")
        private String EndTime;

    }

}
