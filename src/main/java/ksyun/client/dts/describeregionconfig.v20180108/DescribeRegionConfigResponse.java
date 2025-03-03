package ksyun.client.dts.describeregionconfig.v20180108;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeRegionConfigResponse
 * @Description DescribeRegionConfig 返回体
 */
@Data
@ToString
public class DescribeRegionConfigResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
