package ksyun.client.eip.describeeippools.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeEipPoolsResponse
* @Description DescribeEipPools 返回体
*/
@Data
@ToString
public class DescribeEipPoolsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
