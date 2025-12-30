package ksyun.client.kec.modifyscheduledtask.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyScheduledTaskResponse
* @Description ModifyScheduledTask 返回体
*/
@Data
@ToString
public class ModifyScheduledTaskResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

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
