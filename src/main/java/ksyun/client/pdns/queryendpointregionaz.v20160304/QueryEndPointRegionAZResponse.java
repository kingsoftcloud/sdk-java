package ksyun.client.pdns.queryendpointregionaz.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname QueryEndPointRegionAZResponse
* @Description QueryEndPointRegionAZ 返回体
*/
@Data
@ToString
public class QueryEndPointRegionAZResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**查询转发Zone的可用机房列表*/
    @JsonProperty("availableAz")
    private List<String> AvailableAz;

}
