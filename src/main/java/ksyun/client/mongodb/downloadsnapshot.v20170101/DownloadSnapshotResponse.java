package ksyun.client.mongodb.downloadsnapshot.v20170101;

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
    @JsonProperty("SnapshotId")
    private String SnapshotId;

    /***/
    @JsonProperty("Url")
    private String Url;

}
