package ksyun.client.cdn.deleteusagedetaildataexporttask.v20200901;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteUsageDetailDataExportTaskResponse
* @Description DeleteUsageDetailDataExportTask 返回体
*/
@Data
@ToString
public class DeleteUsageDetailDataExportTaskResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
