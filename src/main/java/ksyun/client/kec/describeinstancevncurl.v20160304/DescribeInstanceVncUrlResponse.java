package ksyun.client.kec.describeinstancevncurl.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInstanceVncUrlResponse
* @Description DescribeInstanceVncUrl 返回体
*/
@Data
@ToString
public class DescribeInstanceVncUrlResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**Vnc地址*/
    @JsonProperty("VncUrl")
    private String VncUrl;

}
