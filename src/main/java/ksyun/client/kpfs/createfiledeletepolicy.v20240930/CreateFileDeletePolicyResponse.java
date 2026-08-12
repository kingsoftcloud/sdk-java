package ksyun.client.kpfs.createfiledeletepolicy.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateFileDeletePolicyResponse
* @Description CreateFileDeletePolicy 返回体
*/
@Data
@ToString
public class CreateFileDeletePolicyResponse extends BaseResponseModel {

    /**文件删除策略ID。*/
    @JsonProperty("FileDeletePolicyId")
    private String FileDeletePolicyId;

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

}
