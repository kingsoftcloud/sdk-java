package ksyun.client.clickhouse.rebindsecuritygroup.v20210101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname RebindSecurityGroupResponse
 * @Description RebindSecurityGroup 返回体
 */
@Data
@ToString
public class RebindSecurityGroupResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
