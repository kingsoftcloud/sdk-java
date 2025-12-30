package ksyun.client.milvus.releasedbinstanceeip.v20231010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ReleaseDBInstanceEipResponse
* @Description ReleaseDBInstanceEip 返回体
*/
@Data
@ToString
public class ReleaseDBInstanceEipResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private Boolean Data;

}
