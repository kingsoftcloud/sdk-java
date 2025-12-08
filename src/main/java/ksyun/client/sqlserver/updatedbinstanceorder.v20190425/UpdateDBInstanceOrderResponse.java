package ksyun.client.sqlserver.updatedbinstanceorder.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname UpdateDBInstanceOrderResponse
* @Description UpdateDBInstanceOrder 返回体
*/
@Data
@ToString
public class UpdateDBInstanceOrderResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
