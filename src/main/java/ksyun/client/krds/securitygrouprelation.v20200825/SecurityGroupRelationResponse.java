package ksyun.client.krds.securitygrouprelation.v20200825;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname SecurityGroupRelationResponse
 * @Description SecurityGroupRelation 返回体
 */
@Data
@ToString
public class SecurityGroupRelationResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
