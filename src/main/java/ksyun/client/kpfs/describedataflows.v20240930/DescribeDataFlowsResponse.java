package ksyun.client.kpfs.describedataflows.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDataFlowsResponse
* @Description DescribeDataFlows 返回体
*/
@Data
@ToString
public class DescribeDataFlowsResponse extends BaseResponseModel {

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**数据流动列表信息*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**数据流动ID。*/
        @JsonProperty("DataFlowId")
        private String DataFlowId;

        /**数据流动名称*/
        @JsonProperty("Name")
        private String Name;

        /**KPFS文件系统ID。*/
        @JsonProperty("FileSystemId")
        private String FileSystemId;

        /**数据流动关联的KPFS文件系统目录完整绝对路径。若返回/，代表整个文件系统。*/
        @JsonProperty("DirPath")
        private String DirPath;

        /**KS3 Bucket名称。*/
        @JsonProperty("Bucket")
        private String Bucket;

        /**KS3 Bucket前缀。若返回空，代表整个存储桶。*/
        @JsonProperty("BucketPrefix")
        private String BucketPrefix;

        /**数据流动状态，当该数据流动下存在等待中或运行中状态的数据流动任务时，数据流动为运行中状态。枚举值：running(运行中)、norunning(未运行)*/
        @JsonProperty("Status")
        private String Status;

        /**数据流动创建时间。*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**数据流动更新时间。*/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

        /**描述信息。*/
        @JsonProperty("Description")
        private String Description;

    }

    /**分页大小*/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**页码*/
    @JsonProperty("PageNum")
    private Integer PageNum;

    /**返回的数据流动总数。*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

}
