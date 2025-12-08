package ksyun.client.slb.describebackendservers.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeBackendServersResponse
* @Description DescribeBackendServers 返回体
*/
@Data
@ToString
public class DescribeBackendServersResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**后端服务的信息*/
    @JsonProperty("BackendServerSet")
    private List<BackendServerSetDto> BackendServerSet;

    @Data
    @ToString
    public static class BackendServerSetDto {
    }

}
