package ksyun.client.krds.startaudit.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname StartAuditResponse
* @Description StartAudit 返回体
*/
@Data
@ToString
public class StartAuditResponse extends BaseResponseModel {
    /**请求ID	
–*/
    @JsonProperty("RequestId")
    private String RequestId;

}
