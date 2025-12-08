package ksyun.client.milvus.releasedbinstanceeip.v20231010;

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
