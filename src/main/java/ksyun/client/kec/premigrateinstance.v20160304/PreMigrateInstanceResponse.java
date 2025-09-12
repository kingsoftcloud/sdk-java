package ksyun.client.kec.premigrateinstance.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname PreMigrateInstanceResponse
* @Description PreMigrateInstance 返回体
*/
@Data
@ToString
public class PreMigrateInstanceResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
