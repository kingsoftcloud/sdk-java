package ksyun.client.kce.describegrafanawhitelist.v20230306;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeGrafanaWhiteListResponse
* @Description DescribeGrafanaWhiteList 返回体
*/
@Data
@ToString
public class DescribeGrafanaWhiteListResponse extends BaseResponseModel {

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**公网访问白名单数组*/
    @JsonProperty("WhiteList")
    private List<String> WhiteList;

}
