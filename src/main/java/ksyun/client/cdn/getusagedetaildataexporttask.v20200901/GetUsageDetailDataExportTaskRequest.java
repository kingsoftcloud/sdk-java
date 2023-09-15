package ksyun.client.cdn.getusagedetaildataexporttask.v20200901;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetUsageDetailDataExportTaskRequest
* @Description 请求参数
*/
@Data
public class GetUsageDetailDataExportTaskRequest{
    /**分页大小。默认值：20；最大值：50。取值：1~50之间的任意整数。*/
    @KsYunField(name="PageSize")
    private String PageSize;

    /**取得第几页，取值范围：1~100000。*/
    @KsYunField(name="PageNumber")
    private String PageNumber;


}