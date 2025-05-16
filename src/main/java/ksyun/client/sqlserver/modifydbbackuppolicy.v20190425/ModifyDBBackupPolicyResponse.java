package ksyun.client.sqlserver.modifydbbackuppolicy.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname ModifyDBBackupPolicyResponse
 * @Description ModifyDBBackupPolicy 返回体
 */
@Data
@ToString
public class ModifyDBBackupPolicyResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
