package ksyun.client.kce.describenodecomponents.v20230101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname DescribeNodeComponentsResponse
* @Description DescribeNodeComponents 返回体
*/
@Data
@ToString
public class DescribeNodeComponentsResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
