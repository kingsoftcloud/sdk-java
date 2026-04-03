package ksyun.client.monitor.putdefaulteventpolicy.v20250101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname PutDefaultEventPolicyResponse
* @Description PutDefaultEventPolicy 返回体
*/
@Data
@ToString
public class PutDefaultEventPolicyResponse extends BaseResponseModel {

    /**请求ID。*/
    @JsonProperty("requestId")
    private String RequestId;

    /**当前默认策略名称。*/
    @JsonProperty("DefaultPolicyName")
    private String DefaultPolicyName;

    /**之前默认策略名称。

> 如果之前没有设置过默认策略，则返回空。*/
    @JsonProperty("PreviousDefaultPolicyName")
    private String PreviousDefaultPolicyName;

    /**更新时间。

> 格式：Uinxtime*/
    @JsonProperty("UpdatedAt")
    private Integer UpdatedAt;

}
