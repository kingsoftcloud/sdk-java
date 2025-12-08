package ksyun.client.kec.deletescheduledtask.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteScheduledTaskResponse
* @Description DeleteScheduledTask 返回体
*/
@Data
@ToString
public class DeleteScheduledTaskResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("ReturnSet")
    private ReturnSetDto ReturnSet;

    @Data
    @ToString
    public static class ReturnSetDto {
        /***/
        @JsonProperty("ScalingScheduleTaskId")
        private String ScalingScheduleTaskId;

        /***/
        @JsonProperty("Message")
        private String Message;

    }

}
