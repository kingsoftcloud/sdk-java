package ksyun.client.kce.describemonitorlist.v20230306;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname DescribeMonitorListResponse
* @Description DescribeMonitorList 返回体
*/
@Data
@ToString
public class DescribeMonitorListResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
