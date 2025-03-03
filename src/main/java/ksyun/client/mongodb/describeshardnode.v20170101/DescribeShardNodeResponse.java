package ksyun.client.mongodb.describeshardnode.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeShardNodeResponse
 * @Description DescribeShardNode 返回体
 */
@Data
@ToString
public class DescribeShardNodeResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
