package ksyun.client.krds.stopaudit.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname StopAuditResponse
* @Description StopAudit 返回体
*/
@Data
@ToString
public class StopAuditResponse extends BaseResponseModel {

    /**请求ID	
–*/
    @JsonProperty("RequestId")
    private String RequestId;

}
