package ksyun.client.vpc.describedirectconnects.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname DescribeDirectConnectsResponse
 * @Description DescribeDirectConnects 返回体
 */
@Data
@ToString
public class DescribeDirectConnectsResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
