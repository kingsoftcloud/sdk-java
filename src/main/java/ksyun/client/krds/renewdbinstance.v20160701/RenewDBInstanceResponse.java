package ksyun.client.krds.renewdbinstance.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname RenewDBInstanceResponse
* @Description RenewDBInstance 返回体
*/
@Data
@ToString
public class RenewDBInstanceResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
