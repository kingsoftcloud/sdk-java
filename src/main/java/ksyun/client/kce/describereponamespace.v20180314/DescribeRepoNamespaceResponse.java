package ksyun.client.kce.describereponamespace.v20180314;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname DescribeRepoNamespaceResponse
 * @Description DescribeRepoNamespace 返回体
 */
@Data
@ToString
public class DescribeRepoNamespaceResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
