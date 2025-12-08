package ksyun.client.kec.deletelocalvolumesnapshot.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteLocalVolumeSnapshotResponse
* @Description DeleteLocalVolumeSnapshot 返回体
*/
@Data
@ToString
public class DeleteLocalVolumeSnapshotResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("ReturnSet")
    private List<ReturnSetDto> ReturnSet;

    @Data
    @ToString
    public static class ReturnSetDto {
        /***/
        @JsonProperty("LocalVolumeSnapshotId")
        private String LocalVolumeSnapshotId;

        /***/
        @JsonProperty("Return")
        private Boolean ReturnField;

        /***/
        @JsonProperty("Reason")
        private String Reason;

        /***/
        @JsonProperty("ErrorCode")
        private String ErrorCode;

    }

}
