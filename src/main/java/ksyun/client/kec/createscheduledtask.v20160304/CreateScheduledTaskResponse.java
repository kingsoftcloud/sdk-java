package ksyun.client.kec.createscheduledtask.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateScheduledTaskResponse
* @Description CreateScheduledTask 返回体
*/
@Data
@ToString
public class CreateScheduledTaskResponse extends BaseResponseModel {
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

    }

}
