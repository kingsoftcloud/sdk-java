package ksyun.client.kcs.downloadlevelsnapshot.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DownloadLevelSnapshotResponse
* @Description DownloadLevelSnapshot 返回体
*/
@Data
@ToString
public class DownloadLevelSnapshotResponse extends BaseResponseModel {
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
        @JsonProperty("download_url")
        private List<String> Download_url;

    }

}
