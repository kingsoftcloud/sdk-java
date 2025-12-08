package ksyun.client.krds.startslowlogdetailexporttask.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname StartSlowLogDetailExportTaskResponse
* @Description StartSlowLogDetailExportTask 返回体
*/
@Data
@ToString
public class StartSlowLogDetailExportTaskResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
