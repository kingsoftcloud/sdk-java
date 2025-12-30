package ksyun.client.influxdb.renameinstance.v20191010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RenameInstanceResponse
* @Description RenameInstance 返回体
*/
@Data
@ToString
public class RenameInstanceResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
