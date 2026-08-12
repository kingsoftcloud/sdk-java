package ksyun.client.kpfs.describedataflowstrategysubscribe.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDataFlowStrategySubscribeResponse
* @Description DescribeDataFlowStrategySubscribe 返回体
*/
@Data
@ToString
public class DescribeDataFlowStrategySubscribeResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /**数据流动订阅记录列表*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**该条订阅ID*/
        @JsonProperty("SubscribeId")
        private String SubscribeId;

        /**该条订阅的开始时间*/
        @JsonProperty("StartTime")
        private String StartTime;

        /**该条订阅的结束时间*/
        @JsonProperty("EndTime")
        private String EndTime;

    }

}
