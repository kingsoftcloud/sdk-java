package ksyun.client.kce.describeaddoninstances.v20230101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeAddonInstancesResponse
 * @Description DescribeAddonInstances 返回体
 */
@Data
@ToString
public class DescribeAddonInstancesResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
