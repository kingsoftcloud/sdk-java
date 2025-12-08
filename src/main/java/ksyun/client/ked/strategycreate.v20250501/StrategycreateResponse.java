package ksyun.client.ked.strategycreate.v20250501;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname StrategycreateResponse
* @Description Strategycreate 返回体
*/
@Data
@ToString
public class StrategycreateResponse extends BaseResponseModel {
    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("code")
    private Integer Code;

    /***/
    @JsonProperty("message")
    private String Message;

    /***/
    @JsonProperty("detail")
    private String Detail;

    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("id")
        private Integer Id;

        /**策略id*/
        @JsonProperty("strategyId")
        private String StrategyId;

        /***/
        @JsonProperty("strategyName")
        private String StrategyName;

        /***/
        @JsonProperty("accountId")
        private Integer AccountId;

        /***/
        @JsonProperty("comment")
        private String Comment;

        /**已绑定实例数*/
        @JsonProperty("instanceNum")
        private String InstanceNum;

        /***/
        @JsonProperty("createTime")
        private String CreateTime;

        /***/
        @JsonProperty("updateTime")
        private String UpdateTime;

    }

}
