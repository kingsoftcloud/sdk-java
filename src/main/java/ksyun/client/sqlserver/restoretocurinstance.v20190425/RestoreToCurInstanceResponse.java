package ksyun.client.sqlserver.restoretocurinstance.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname RestoreToCurInstanceResponse
 * @Description RestoreToCurInstance 返回体
 */
@Data
@ToString
public class RestoreToCurInstanceResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
