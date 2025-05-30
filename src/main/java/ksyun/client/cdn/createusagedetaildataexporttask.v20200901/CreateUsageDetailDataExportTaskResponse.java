package ksyun.client.cdn.createusagedetaildataexporttask.v20200901;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname CreateUsageDetailDataExportTaskResponse
 * @Description CreateUsageDetailDataExportTask 返回体
 */
@Data
@ToString
public class CreateUsageDetailDataExportTaskResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
