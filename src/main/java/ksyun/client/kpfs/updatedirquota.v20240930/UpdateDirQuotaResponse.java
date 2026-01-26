package ksyun.client.kpfs.updatedirquota.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateDirQuotaResponse
* @Description UpdateDirQuota 返回体
*/
@Data
@ToString
public class UpdateDirQuotaResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
