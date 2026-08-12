package ksyun.client.kpfs.describedataflowstrategysubscribefailed.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDataFlowStrategySubscribeFailedResponse
* @Description DescribeDataFlowStrategySubscribeFailed 返回体
*/
@Data
@ToString
public class DescribeDataFlowStrategySubscribeFailedResponse extends BaseResponseModel {

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**数据流动订阅失败事件列表*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**事件时间。*/
        @JsonProperty("EventTime")
        private String EventTime;

        /**对象名称。*/
        @JsonProperty("ObjectKey")
        private String ObjectKey;

        /**事件类型，当前支持Put，即上传或修改文件。*/
        @JsonProperty("EventType")
        private String EventType;

        /**失败原因。*/
        @JsonProperty("FailedReason")
        private String FailedReason;

        /**失败的消息内容。*/
        @JsonProperty("Content")
        private String Content;

    }

}
