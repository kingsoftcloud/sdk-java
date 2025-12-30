package ksyun.client.kcs.downloadsnapshot.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DownloadSnapshotResponse
* @Description DownloadSnapshot 返回体
*/
@Data
@ToString
public class DownloadSnapshotResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("snapshotId")
        private String SnapshotId;

        /***/
        @JsonProperty("url")
        private String Url;

    }

}
