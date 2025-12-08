package ksyun.client.kcs.describesnapshots.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSnapshotsResponse
* @Description DescribeSnapshots 返回体
*/
@Data
@ToString
public class DescribeSnapshotsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("snapshotId")
        private String SnapshotId;

        /***/
        @JsonProperty("name")
        private String Name;

        /***/
        @JsonProperty("cacheId")
        private String CacheId;

        /***/
        @JsonProperty("type")
        private String Type;

        /***/
        @JsonProperty("status")
        private String Status;

        /***/
        @JsonProperty("shardId")
        private String ShardId;

        /***/
        @JsonProperty("createTime")
        private String CreateTime;

        /***/
        @JsonProperty("resourceSize")
        private String ResourceSize;

    }

}
