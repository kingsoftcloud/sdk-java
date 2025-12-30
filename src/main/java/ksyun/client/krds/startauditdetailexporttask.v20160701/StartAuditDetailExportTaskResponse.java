package ksyun.client.krds.startauditdetailexporttask.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname StartAuditDetailExportTaskResponse
* @Description StartAuditDetailExportTask 返回体
*/
@Data
@ToString
public class StartAuditDetailExportTaskResponse extends BaseResponseModel {

    /**请求ID	
–*/
    @JsonProperty("RequestId")
    private String RequestId;

}
