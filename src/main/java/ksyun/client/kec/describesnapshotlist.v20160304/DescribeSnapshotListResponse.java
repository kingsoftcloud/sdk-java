package ksyun.client.kec.describesnapshotlist.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSnapshotListResponse
* @Description DescribeSnapshotList 返回体
*/
@Data
@ToString
public class DescribeSnapshotListResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**页码*/
    @JsonProperty("PageNum")
    private Integer PageNum;

    /**分页大小*/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**快照总个数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**快照信息*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**快照创建时间，格式为：yyyy-MM-ddThh:mmZ*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**过期时间*/
        @JsonProperty("ExpireTime")
        private String ExpireTime;

        /**快照名称*/
        @JsonProperty("SnapshotName")
        private String SnapshotName;

        /**快照ID*/
        @JsonProperty("SnapshotId")
        private String SnapshotId;

        /**快照状态*/
        @JsonProperty("SnapshotStatus")
        private String SnapshotStatus;

        /**快照创建类型*/
        @JsonProperty("SnapshotType")
        private String SnapshotType;

        /**文件系统ID*/
        @JsonProperty("FileSystemId")
        private String FileSystemId;

        /**文件系统名称*/
        @JsonProperty("FileSystemName")
        private String FileSystemName;

        /**快照保留天数*/
        @JsonProperty("AliveDays")
        private Integer AliveDays;

        /**快照描述信息*/
        @JsonProperty("Description")
        private String Description;

    }

}
