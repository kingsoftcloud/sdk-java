package ksyun.client.sqlserver.createimporttask.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateImportTaskResponse
* @Description CreateImportTask 返回体
*/
@Data
@ToString
public class CreateImportTaskResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
