package ksyun.client.aicp.deletesession.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteSessionResponse
* @Description DeleteSession 返回体
*/
@Data
@ToString
public class DeleteSessionResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Action")
    private String Action;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("Deleted")
        private Boolean Deleted;

        /***/
        @JsonProperty("RuntimeSync")
        private DataRuntimeSyncDto RuntimeSync;

        @Data
        @ToString
        public static class DataRuntimeSyncDto {
        }

    }

}
