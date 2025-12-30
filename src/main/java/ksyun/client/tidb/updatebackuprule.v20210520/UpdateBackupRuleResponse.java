package ksyun.client.tidb.updatebackuprule.v20210520;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateBackupRuleResponse
* @Description UpdateBackupRule 返回体
*/
@Data
@ToString
public class UpdateBackupRuleResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private Boolean Data;

}
