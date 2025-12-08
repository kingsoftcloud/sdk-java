package ksyun.client.ter.describestackevents.v20240415;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname DescribeStackEventsResponse
* @Description DescribeStackEvents 返回体
*/
@Data
@ToString
public class DescribeStackEventsResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
