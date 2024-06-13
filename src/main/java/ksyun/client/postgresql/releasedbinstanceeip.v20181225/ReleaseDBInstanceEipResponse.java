package ksyun.client.postgresql.releasedbinstanceeip.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname ReleaseDBInstanceEipResponse
* @Description ReleaseDBInstanceEip 返回体
*/
@Data
@ToString
public class ReleaseDBInstanceEipResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
