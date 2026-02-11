package ksyun.client.kpfs.describedataflowtasks.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDataFlowTasksResponse
* @Description DescribeDataFlowTasks 返回体
*/
@Data
@ToString
public class DescribeDataFlowTasksResponse extends BaseResponseModel {

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**数据流动任务列表信息*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**KPFS文件系统ID。*/
        @JsonProperty("FileSystemId")
        private String FileSystemId;

        /**数据流动ID。*/
        @JsonProperty("DataFlowId")
        private String DataFlowId;

        /**数据流动名称。*/
        @JsonProperty("Name")
        private String Name;

        /**数据流动关联的KPFS文件系统目录完整绝对路径。若返回/，代表整个文件系统。*/
        @JsonProperty("DirPath")
        private String DirPath;

        /**KS3 Bucket名称*/
        @JsonProperty("Bucket")
        private String Bucket;

        /**KS3 Bucket前缀。若返回空，代表整个存储桶。*/
        @JsonProperty("BucketPrefix")
        private String BucketPrefix;

        /**数据流动任务ID。*/
        @JsonProperty("TaskId")
        private String TaskId;

        /**数据流动任务类型。当前仅支持import。*/
        @JsonProperty("TaskAction")
        private String TaskAction;

        /**数据的源目录，为数据流动绑定关系中BucketPrefix下的相对路径。*/
        @JsonProperty("SrcDirectory")
        private String SrcDirectory;

        /**数据的目标目录，为数据流动绑定关系中DirPath下的相对路径。*/
        @JsonProperty("DstDirectory")
        private String DstDirectory;

        /**任务的运行状态，枚举值：waiting、running、closed、abnormal、completed*/
        @JsonProperty("Status")
        private String Status;

        /**任务创建时间。*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**任务开始时间。*/
        @JsonProperty("StartTime")
        private String StartTime;

        /**任务结束时间。*/
        @JsonProperty("EndTime")
        private String EndTime;

        /**任务执行时长。单位s。*/
        @JsonProperty("ExcuteTime")
        private String ExcuteTime;

    }

    /**分页大小。*/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**页码。*/
    @JsonProperty("PageNum")
    private Integer PageNum;

    /**返回的数据流动任务总数。*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

}
