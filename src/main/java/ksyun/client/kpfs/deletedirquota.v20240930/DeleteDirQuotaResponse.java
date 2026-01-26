package ksyun.client.kpfs.deletedirquota.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteDirQuotaResponse
* @Description DeleteDirQuota 返回体
*/
@Data
@ToString
public class DeleteDirQuotaResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
