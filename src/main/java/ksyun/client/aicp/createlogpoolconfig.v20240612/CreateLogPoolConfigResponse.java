package ksyun.client.aicp.createlogpoolconfig.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateLogPoolConfigResponse
* @Description CreateLogPoolConfig 返回体
*/
@Data
@ToString
public class CreateLogPoolConfigResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestID")
    private String RequestID;

}
