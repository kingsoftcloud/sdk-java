package ksyun.client.cdn.getusagedetaildataexporttask.v20200901;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname GetUsageDetailDataExportTaskResponse
* @Description GetUsageDetailDataExportTask 返回体
*/
@Data
@ToString
public class GetUsageDetailDataExportTaskResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
