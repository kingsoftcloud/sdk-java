package ksyun.client.clickhouse.listinstance.v20210101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListInstanceResponse
* @Description ListInstance 返回体
*/
@Data
@ToString
public class ListInstanceResponse extends BaseResponseModel {
    /**1*/
    @JsonProperty("1")
    private Integer Field1;

}
