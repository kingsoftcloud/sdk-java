package ksyun.client.krds.gettablerestorabletime.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetTableRestorableTimeResponse
* @Description GetTableRestorableTime 返回体
*/
@Data
@ToString
public class GetTableRestorableTimeResponse extends BaseResponseModel {
    /**	
*/
    @JsonProperty("RestorableTime")
    private RestorableTimeDto RestorableTime;

    @Data
    @ToString
    public static class RestorableTimeDto {
        /**库表可恢复时间段下限
*/
        @JsonProperty("Begin")
        private String Begin;

        /**库表可恢复时间段上限
*/
        @JsonProperty("End")
        private String End;

    }

    /**请求id
*/
    @JsonProperty("RequestId")
    private String RequestId;

}
