package ksyun.client.dmp.describemonitorpanellist.v20240101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeMonitorPanelListResponse
 * @Description DescribeMonitorPanelList 返回体
 */
@Data
@ToString
public class DescribeMonitorPanelListResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
