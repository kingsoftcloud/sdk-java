package ksyun.client.kpfs.createdirquota.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateDirQuotaResponse
* @Description CreateDirQuota 返回体
*/
@Data
@ToString
public class CreateDirQuotaResponse extends BaseResponseModel {

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

}
