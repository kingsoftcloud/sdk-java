package ksyun.client.krds.startslowlogdetailexporttask.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname StartSlowLogDetailExportTaskResponse
 * @Description StartSlowLogDetailExportTask 返回体
 */
@Data
@ToString
public class StartSlowLogDetailExportTaskResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
