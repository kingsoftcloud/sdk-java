package ksyun.client.kcrs.getretentiontrigger.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetRetentionTriggerResponse
* @Description GetRetentionTrigger 返回体
*/
@Data
@ToString
public class GetRetentionTriggerResponse extends BaseResponseModel {

    /**请求Id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**返回响应体*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**触发频率*/
        @JsonProperty("DisplayText")
        private String DisplayText;

        /**Cron表达式*/
        @JsonProperty("Cron")
        private String Cron;

        /**可选参数*/
        @JsonProperty("Optional")
        private List<String> Optional;

    }

}
