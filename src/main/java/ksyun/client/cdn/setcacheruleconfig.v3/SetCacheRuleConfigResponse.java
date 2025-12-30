package ksyun.client.cdn.setcacheruleconfig.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetCacheRuleConfigResponse
* @Description SetCacheRuleConfig 返回体
*/
@Data
@ToString
public class SetCacheRuleConfigResponse extends BaseResponseModel {

    /***/
    @JsonProperty("SetCacheRuleConfigResponse")
    private String SetCacheRuleConfigResponse;

}
