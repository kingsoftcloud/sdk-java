package ksyun.client.kec.cancelpremigrateinstance.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname CancelPreMigrateInstanceResponse
 * @Description CancelPreMigrateInstance 返回体
 */
@Data
@ToString
public class CancelPreMigrateInstanceResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
