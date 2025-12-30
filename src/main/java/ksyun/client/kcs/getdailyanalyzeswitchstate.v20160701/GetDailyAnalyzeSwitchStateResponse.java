package ksyun.client.kcs.getdailyanalyzeswitchstate.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetDailyAnalyzeSwitchStateResponse
* @Description GetDailyAnalyzeSwitchState 返回体
*/
@Data
@ToString
public class GetDailyAnalyzeSwitchStateResponse extends BaseResponseModel {

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
        @JsonProperty("slowlog")
        private Boolean Slowlog;

        /***/
        @JsonProperty("servicelog")
        private Boolean Servicelog;

    }

}
