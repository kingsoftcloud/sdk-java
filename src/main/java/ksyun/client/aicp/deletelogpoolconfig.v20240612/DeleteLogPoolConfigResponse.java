package ksyun.client.aicp.deletelogpoolconfig.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteLogPoolConfigResponse
* @Description DeleteLogPoolConfig 返回体
*/
@Data
@ToString
public class DeleteLogPoolConfigResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
