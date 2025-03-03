package ksyun.client.kad.describeoverview.v20161122;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeOverviewResponse
 * @Description DescribeOverview 返回体
 */
@Data
@ToString
public class DescribeOverviewResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
