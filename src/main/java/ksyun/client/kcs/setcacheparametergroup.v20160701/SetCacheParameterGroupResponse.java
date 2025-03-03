package ksyun.client.kcs.setcacheparametergroup.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname SetCacheParameterGroupResponse
 * @Description SetCacheParameterGroup 返回体
 */
@Data
@ToString
public class SetCacheParameterGroupResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
