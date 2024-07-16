package ksyun.client.kci.describeimagecacheevent.v20200702;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname DescribeImageCacheEventResponse
* @Description DescribeImageCacheEvent 返回体
*/
@Data
@ToString
public class DescribeImageCacheEventResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
