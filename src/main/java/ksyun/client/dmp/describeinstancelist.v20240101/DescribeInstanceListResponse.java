package ksyun.client.dmp.describeinstancelist.v20240101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname DescribeInstanceListResponse
 * @Description DescribeInstanceList 返回体
 */
@Data
@ToString
public class DescribeInstanceListResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
