package ksyun.client.kci.describeimagecacheevent.v20200702;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeImageCacheEventResponse
* @Description DescribeImageCacheEvent 返回体
*/
@Data
@ToString
public class DescribeImageCacheEventResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Events")
    private List<EventsDto> Events;

    @Data
    @ToString
    public static class EventsDto {
        /**首次出现时间*/
        @JsonProperty("FirstTimestamp")
        private String FirstTimestamp;

        /**最后一次出现时间*/
        @JsonProperty("LastTimestamp")
        private String LastTimestamp;

        /**出现次数*/
        @JsonProperty("Count")
        private Integer Count;

        /**类型*/
        @JsonProperty("Type")
        private String Type;

        /**事件产生原因*/
        @JsonProperty("Reason")
        private String Reason;

        /**详情*/
        @JsonProperty("Message")
        private String Message;

    }

}
